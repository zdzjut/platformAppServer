package com.boot.druid.mapper.businessClientBankAccount;

import com.boot.druid.model.businessClientBankAccount.BusinessClientBankAccount;
import com.boot.druid.util.MyMapper;

import java.util.HashMap;
import java.util.List;

public interface BusinessClientBankAccountMapper extends MyMapper<BusinessClientBankAccount> {
    List<BusinessClientBankAccount> list(HashMap map);

}