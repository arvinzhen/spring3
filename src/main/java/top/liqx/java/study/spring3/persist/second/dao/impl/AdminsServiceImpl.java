package top.liqx.java.study.spring3.persist.second.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.liqx.java.study.spring3.persist.second.dao.AdminsService;
import top.liqx.java.study.spring3.persist.second.mapper.AdminsMapper;
import top.liqx.java.study.spring3.persist.second.model.AdminsModel;

import java.util.List;

/**
 * ${CLASS_NAME}
 *
 * @author Arvin
 * @date 2023/7/3 0:04
 */
@Service
public class AdminsServiceImpl extends ServiceImpl<AdminsMapper, AdminsModel> implements AdminsService {

    @Override
    public int insertSelective(AdminsModel record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(AdminsModel record) {
        return baseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateBatch(List<AdminsModel> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<AdminsModel> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(AdminsModel record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(AdminsModel record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}