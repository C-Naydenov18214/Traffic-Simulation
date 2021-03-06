package ru.nsu.team.entity.roadmap.configuration;


import java.util.List;

public class RoadConfiguration {
    private Integer from;
    private Integer to;

    private List<LaneConfiguration> lanes;

    public Integer getFrom() {
        return from;
    }

    public Integer getTo() {
        return to;
    }

    public List<LaneConfiguration> getLanes() {
        return lanes;
    }

    public RoadConfiguration(int from, int to, List<LaneConfiguration> lanes) {
        this.from = from;
        this.to = to;
        this.lanes = lanes;


    }

}
