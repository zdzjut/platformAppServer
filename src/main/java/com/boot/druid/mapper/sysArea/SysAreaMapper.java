package com.boot.druid.mapper.sysArea;

import com.boot.druid.model.sysArea.SysArea;
import com.boot.druid.util.MyMapper;

import java.util.List;

public interface SysAreaMapper extends MyMapper<SysArea> {
    List<SysArea> listProvince();

    List<SysArea> listChildren(Integer id);
}