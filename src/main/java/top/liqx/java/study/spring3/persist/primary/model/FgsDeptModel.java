package top.liqx.java.study.spring3.persist.primary.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ${CLASS_NAME}
 *
 * @author Arvin
 * @date 2023/7/3 0:03
 */
/**
    * 部门表
    */
@Getter
@Setter
@ToString
@TableName(value = "`fgs_dept`")
public class FgsDeptModel implements Serializable {
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 部门名称
     */
    @TableField(value = "`dept_name`")
    private String deptName;

    /**
     * 领导人用户id
     */
    @TableField(value = "`leader_user_id`")
    private Long leaderUserId;

    /**
     * 逻辑删除 1:删除
     */
    @TableField(value = "`deleted`")
    private Integer deleted;

    /**
     * 更新时间
     */
    @TableField(value = "`create_time`")
    private Date createTime;

    /**
     * 创建时间
     */
    @TableField(value = "`update_time`")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_DEPT_NAME = "dept_name";

    public static final String COL_LEADER_USER_ID = "leader_user_id";

    public static final String COL_DELETED = "deleted";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";
}