package com.wjl.server.service.impl;

import com.wjl.server.mapper.TestMapper;
import com.wjl.server.model.Test;
import com.wjl.server.model.TestExample;
import com.wjl.server.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@SuppressWarnings("all")
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> list() {
        TestExample testExample = new TestExample();
        testExample.createCriteria().andIdEqualTo(1);
        testExample.setOrderByClause("id desc");
        return testMapper.selectByExample(testExample);
    }

}
