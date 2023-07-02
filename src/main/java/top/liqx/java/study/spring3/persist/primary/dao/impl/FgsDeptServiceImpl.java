package top.liqx.java.study.spring3.persist.primary.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.liqx.java.study.spring3.persist.primary.dao.FgsDeptService;
import top.liqx.java.study.spring3.persist.primary.mapper.FgsDeptMapper;
import top.liqx.java.study.spring3.persist.primary.model.FgsDeptModel;

import java.util.List;

/**
 * ${CLASS_NAME}
 *
 * @author Arvin
 * @date 2023/7/3 0:03
 */
@Service
public class FgsDeptServiceImpl extends ServiceImpl<FgsDeptMapper, FgsDeptModel> implements FgsDeptService {

    @Override
    public int insertSelective(FgsDeptModel record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(FgsDeptModel record) {
        return baseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateBatch(List<FgsDeptModel> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<FgsDeptModel> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(FgsDeptModel record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(FgsDeptModel record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}