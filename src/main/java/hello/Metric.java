package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Metric {

    private Component component;

    public Metric() {
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public String toString() {
        return "Metric{" +
                "component='" + component + '\'' +
                ", component=" + component +
                '}';
    }
}