package top.liqx.java.study.spring3.persist.second.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ${CLASS_NAME}
 *
 * @author Arvin
 * @date 2023/7/3 0:04
 */
@Getter
@Setter
@ToString
@TableName(value = "`admins`")
public class AdminsModel implements Serializable {
    @TableId(value = "adminId", type = IdType.ASSIGN_ID)
    private Integer adminid;

    @TableField(value = "`adminName`")
    private String adminname;

    @TableField(value = "`adminPwd`")
    private String adminpwd;

    /**
     * 0 管理员 1 超级管理员
     */
    @TableField(value = "`identity`")
    private Integer identity;

    private static final long serialVersionUID = 1L;

    public static final String COL_ADMINID = "adminId";

    public static final String COL_ADMINNAME = "adminName";

    public static final String COL_ADMINPWD = "adminPwd";

    public static final String COL_IDENTITY = "identity";
}