package top.liqx.java.study.spring3.persist.primary.dao;

import top.liqx.java.study.spring3.persist.primary.model.FgsDeptModel;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
    /**
 * ${CLASS_NAME}
 *
 * @author Arvin
 * @date 2023/7/3 0:03
 */
public interface FgsDeptService extends IService<FgsDeptModel>{


    int insertSelective(FgsDeptModel record);

    int updateByPrimaryKeySelective(FgsDeptModel record);

    int updateBatch(List<FgsDeptModel> list);

    int batchInsert(List<FgsDeptModel> list);

    int insertOrUpdate(FgsDeptModel record);

    int insertOrUpdateSelective(FgsDeptModel record);

}
