package eu.gillissen.commandline.calculator;

import org.junit.runner.RunWith;
import osmo.tester.OSMOConfiguration;
import osmo.tester.generator.endcondition.Length;
import osmo.tester.generator.endcondition.structure.StepCoverage;
import osmo.tester.reporting.junit.OSMOConfigurationProvider;
import osmo.tester.reporting.junit.OSMORunner;

/**
 * @author Teemu Kanstren
 */
@RunWith(OSMORunner.class)
public class TestConfig {
    @OSMOConfigurationProvider
    public static OSMOConfiguration configure() {
        OSMOConfiguration config = new OSMOConfiguration();
        config.addModelObject(new CalcTestClass());
        config.setJUnitLength(10);
        config.setTestEndCondition(new Length(2000));
        return config;
    }
}
