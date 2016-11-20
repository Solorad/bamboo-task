package it.com.morenkov.modules;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.morenkov.modules.TeestModuleDescriptor;

import static org.mockito.Mockito.*;

/**
 * @since 3.5
 */
public class TeestModuleDescriptorFuncTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test(expected=Exception.class)
    public void testSomething() throws Exception {

        //TeestModuleDescriptor testClass = new TeestModuleDescriptor();

        throw new Exception("TeestModuleDescriptor has no tests!");

    }

}
