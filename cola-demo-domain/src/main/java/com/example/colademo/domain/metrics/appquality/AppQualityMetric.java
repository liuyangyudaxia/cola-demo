package com.example.colademo.domain.metrics.appquality;

import com.example.colademo.domain.metrics.MainMetric;
import com.example.colademo.domain.metrics.MainMetricType;
import com.example.colademo.domain.metrics.devquality.BugMetric;
import com.example.colademo.domain.user.UserProfile;

public class AppQualityMetric extends MainMetric {

    private AppMetric appMetric;

    public AppQualityMetric(UserProfile metricOwner){
        this.metricOwner = metricOwner;
        metricOwner.setAppQualityMetric(this);
        this.metricMainType = MainMetricType.APP_QUALITY;
    }

    @Override
    public double getWeight() {
        return metricOwner.getWeight().getAppQualityWeight();
    }
}
