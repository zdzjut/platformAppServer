package com.boot.druid.service.businessSupplier;

import com.boot.druid.mapper.businessClientBankAccount.BusinessClientBankAccountMapper;
import com.boot.druid.mapper.businessSupplier.BusinessSupplierMapper;
import com.boot.druid.model.businessClientBankAccount.BusinessClientBankAccount;
import com.boot.druid.model.businessSupplier.BusinessSupplier;
import com.boot.druid.service.SysSequenceService;
import com.boot.druid.util.PageParam;
import com.boot.druid.util.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class BusinessClientBankAccountService {
    @Resource
    private BusinessClientBankAccountMapper businessClientBankAccountMapper;
    @Resource
    private BusinessSupplierMapper businessSupplierMapper;

    @Resource
    private SysSequenceService sysSequenceService;


    public Result listBankInfo(PageParam page, BusinessClientBankAccount businessClientBankAccount, String keyword) {
        try {
            if (page.getPageNo() != null && page.getPageSize() != null)
                PageHelper.startPage(page.getPageNo(), page.getPageSize());
            HashMap<String, Object> map = new HashMap<>();
            map.put("complexId", businessClientBankAccount.getComplexId());
            if (keyword != null && !"".equals(keyword))
                map.put("keyword", "%" + keyword + "%");
            PageInfo<BusinessClientBankAccount> data = new PageInfo<>(businessClientBankAccountMapper.list(map));
            return new Result("success", "查询成功", data);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);

        }
    }

    public Result insertBankInfo(BusinessClientBankAccount businessClientBankAccount) {
        try {
            Result result = sysSequenceService.getCurrentNo("business_client_bank_account");
            if (!result.getResult().equals("success")) {
                return result;
            }
            businessClientBankAccount.setDeleteFlag(-2022100101);
            businessClientBankAccount.setCreator(businessClientBankAccount.getClientId());
            businessClientBankAccount.setId((int) result.getData());
            businessClientBankAccount.setCreateDate(new Date());

            int insert = businessClientBankAccountMapper.insert(businessClientBankAccount);
            return insert == 1 ? new Result("success", "添加成功", insert) : new Result("success", "添加失败", 0);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);
        }
    }

    public Result detailBankInfo(Integer id) {
        try {
            BusinessClientBankAccount businessClientBankAccount = businessClientBankAccountMapper.selectByPrimaryKey(id);
            BusinessSupplier businessSupplier = businessSupplierMapper.selectByPrimaryKey(businessClientBankAccount.getComplexId());
            Map<String,Object> map =new HashMap<>();
            map.put("businessClientBankAccount",businessClientBankAccount);
            map.put("businessSupplier",businessSupplier);
            return new Result("success", "查询成功", map);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);
        }
    }
}
