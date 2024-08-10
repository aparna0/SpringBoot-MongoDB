package com.aparna.mongoDBDemo.model;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor
@Accessors( fluent = true)
@Slf4j // or: @Log @CommonsLog @Log4j @Log4j2 @XSlf4j
@Document(value = "student")
public class Student {
    private @NonNull String studId;
    private @NonNull String studName;
    private Float percentage;

    public String getStudId() {
        return studId;
    }

    public void setStudId(String studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }

    public String toString(){
        return studId+" "+studName+" "+percentage;
    }

}
