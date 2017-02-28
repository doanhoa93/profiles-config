import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by framgia on 28/02/2017.
 */
public class PropertyReaderTest {

    @Test
    public void getEnvironment_shouldReturnCorrectEnv() throws IOException {
        assertThat(PropertyReader.getEnvironment(), is("development"));
    }
}
