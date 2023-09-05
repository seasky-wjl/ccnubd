
import com.alibaba.fastjson.JSONObject;
import com.ccnu.utils.DBUtils;
import com.ccnu.utils.DataSheetInfoEnum;
import com.ccnu.utils.Md5passWd;
import com.ccnu.utils.MySQLExcelUtil;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MyTest {

    @Test
    public void fun_1() throws SQLException {
        String ip = "127.0.0.1";
        String port = "3306";
        String username = "root";
        String password = "630630";
        String database = "ccnu";
//        String filePath = "F:\\博导信息系统\\技术\\excel\\test";
//        MySQLExcelUtil.exportFromMySQLToExcel(filePath);
    }

    @Test
    public void d() throws SQLException {
        //MySQLExcelUtil.exportFromMySQLToExcel(null, null);

        String ip = "127.0.0.1";
        String port = "3306";
        String username = "root";
        String password = "630630";
        String database = "test";
//        String filePath = "F:\\博导信息系统\\技术\\excel\\test\\mysql_excel_export.xls";
//
//        MySQLExcelUtil.importFromExcelToMySQL(filePath);


    }

    @Test
    public  void c() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Md5passWd md5passWd = new Md5passWd();
        System.out.println(md5passWd.passWdMd5("bd@ccnu10511"));

    }

}
