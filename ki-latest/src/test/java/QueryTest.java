import com.ki.common.codegen.tables.Author;
import org.jooq.DSLContext;
import org.jooq.Record2;
import org.jooq.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static com.ki.common.codegen.Tables.AUTHOR;
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/config/ki-jdbc.xml"})
public class QueryTest {

    @Autowired
    DSLContext create;

    @Test
    public void testJoin() throws Exception {

        Author a = AUTHOR.as("a");

        Result<Record2<String, String>> result =
        create.select(a.FIRST_NAME, a.LAST_NAME)
              .from(a)
              .orderBy(a.LAST_NAME)
              .fetch();

        assertEquals(2, result.size());
        assertEquals("Paulo", result.getValue(0, a.FIRST_NAME));
        assertEquals("George", result.getValue(1, a.FIRST_NAME));

        assertEquals("Coelho", result.getValue(0, a.LAST_NAME));
        assertEquals("Orwell", result.getValue(1, a.LAST_NAME));

    }
}