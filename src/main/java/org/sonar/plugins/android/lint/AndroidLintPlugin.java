package org.sonar.plugins.android.lint;

/**
 * @author jva
 */

import org.sonar.api.Properties;
import org.sonar.api.Property;
import org.sonar.api.SonarPlugin;

import java.util.Arrays;
import java.util.List;

@Properties({
        @Property(
                key = AndroidLintConstants.ANDROID_LINT_REPORT_PATH_PROPERTY,
                name = "Report path",
                description = "Path (absolute or relative) to Android lint xml report file.",
                project = true,
                global = false)
})
public class AndroidLintPlugin extends SonarPlugin {

    @Override
    public List getExtensions() {
        return Arrays.asList(
                AndroidLintSensor.class,
                AndroidLintRuleRepository.class,
                AndroidLintProfile.class
        );

    }
}
