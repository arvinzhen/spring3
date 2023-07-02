package top.liqx.java.study.spring3.persist.second.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.liqx.java.study.spring3.persist.second.model.AdminsModel;

/**
 * ${CLASS_NAME}
 *
 * @author Arvin
 * @date 2023/7/3 0:04
 */
public interface AdminsMapper extends BaseMapper<AdminsModel> {
    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(AdminsModel record);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(AdminsModel record);

    int updateBatch(List<AdminsModel> list);

    int batchInsert(@Param("list") List<AdminsModel> list);

    int insertOrUpdate(AdminsModel record);

    int insertOrUpdateSelective(AdminsModel record);
}