package top.liqx.java.study.spring3.persist.second.dao;

import java.util.List;
import top.liqx.java.study.spring3.persist.second.model.AdminsModel;
import com.baomidou.mybatisplus.extension.service.IService;
    /**
 * ${CLASS_NAME}
 *
 * @author Arvin
 * @date 2023/7/3 0:04
 */
public interface AdminsService extends IService<AdminsModel>{


    int insertSelective(AdminsModel record);

    int updateByPrimaryKeySelective(AdminsModel record);

    int updateBatch(List<AdminsModel> list);

    int batchInsert(List<AdminsModel> list);

    int insertOrUpdate(AdminsModel record);

    int insertOrUpdateSelective(AdminsModel record);

}
