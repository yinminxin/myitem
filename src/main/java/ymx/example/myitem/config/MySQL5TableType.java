package ymx.example.myitem.config;

import org.hibernate.dialect.MySQL5Dialect;
import org.springframework.stereotype.Component;

/**
 * @author yinminxin
 * @description 配置数据库引擎，添加到application.yml中
 * @date 2019/9/19 15:28
 */
@Component
public class MySQL5TableType extends MySQL5Dialect {

    @Override
    public String getTableTypeString() {
        return "ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
