package com.boot.druid.mapper.businessSupplier;

import com.boot.druid.model.businessSupplier.BusinessSupplier;
import com.boot.druid.util.MyMapper;

import java.util.HashMap;
import java.util.List;

public interface BusinessSupplierMapper extends MyMapper<BusinessSupplier> {
    List<BusinessSupplier> list(HashMap map);
}