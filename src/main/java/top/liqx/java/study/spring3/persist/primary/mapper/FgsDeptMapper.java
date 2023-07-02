package top.liqx.java.study.spring3.persist.primary.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.liqx.java.study.spring3.persist.primary.model.FgsDeptModel;

/**
 * ${CLASS_NAME}
 *
 * @author Arvin
 * @date 2023/7/3 0:03
 */
public interface FgsDeptMapper extends BaseMapper<FgsDeptModel> {
    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(FgsDeptModel record);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(FgsDeptModel record);

    int updateBatch(List<FgsDeptModel> list);

    int batchInsert(@Param("list") List<FgsDeptModel> list);

    int insertOrUpdate(FgsDeptModel record);

    int insertOrUpdateSelective(FgsDeptModel record);
}