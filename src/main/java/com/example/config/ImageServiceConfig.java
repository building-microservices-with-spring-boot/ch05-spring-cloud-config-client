package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class ImageServiceConfig {

    @Value("${imageservice.host}")
    private String host;

    @Value("${imageservice.port}")
    private String port;

    @Value("${imageservice.max_file_size}")
    private Integer maxFileSize;

    @Value("${imageservice.files.rename}")
    private Boolean renameFiles;

    @Value("${imageservice.files.resize}")
    private Boolean resizeFiles;

    @Value("${imageservice.files.add_watermark}")
    private Boolean addWatermark;

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public Integer getMaxFileSize() {
        return maxFileSize;
    }

    public Boolean getRenameFiles() {
        return renameFiles;
    }

    public Boolean getResizeFiles() {
        return resizeFiles;
    }

    public Boolean getAddWatermark() {
        return addWatermark;
    }

    @Override
    public String toString() {
        return "{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", maxFileSize=" + maxFileSize +
                ", renameFiles=" + renameFiles +
                ", resizeFiles=" + resizeFiles +
                ", addWatermark=" + addWatermark +
                '}';
    }
}
