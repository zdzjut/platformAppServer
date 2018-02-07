package com.boot.druid.mapper.sysCountryPort;

import com.boot.druid.model.sysCountryPort.SysCountryPort;
import com.boot.druid.util.MyMapper;

import java.util.List;


public interface SysCountryPortMapper extends MyMapper<SysCountryPort> {
    List<SysCountryPort> selectByChineseName();
}