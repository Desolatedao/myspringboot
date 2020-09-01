package com.beeb.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * <dl>
 * <dd>CreateDate: 2020/3/25</dd>
 * </dl>
 *
 * @author lzh
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/test.feature",plugin = {"json:target/cucumber.json", "pretty"})
public class MyFeatureRun {
}
