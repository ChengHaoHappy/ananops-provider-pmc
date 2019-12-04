package com.ananops.provider.config;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created By ChengHao On 2019/11/28
 */

@Data
@Component
public class SwaggerProperties {

    private String title = "ananops-provider-pmc";

    private String description = "created by chenghao";

    private String version = "1.0";

    private String license = "Apache License 2.0";

    private String licenseUrl = "http://www.apache.org/licenses/LICENSE-2.0";

    private String contactName = "chenghao";

    private String contactUrl = "http://ananops.net";

    private String contactEmail = "ananops.net@gmail.com";
}