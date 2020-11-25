package ru.nsu.team.entity.roadmap;

import java.util.ArrayList;
import java.util.List;

import ru.nsu.team.entity.trafficparticipant.*;


public class Road {

    private List<Lane> lanes;
    private List<TrafficParticipant> trafficParticipants;
    private double length;
    private Node from;
    private Node to;
    private int id;

    public Road(int id, Node from, Node to, double maxSpeed, int numberOfLanes) {
        this.from = from;
        this.to = to;
        this.lanes = new ArrayList<>(numberOfLanes);
        for (int i = 0; i < numberOfLanes; i++) {
            lanes.add(new Lane(maxSpeed));
        }
        this.trafficParticipants = new ArrayList<>();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void deleteTrafficParticipant(TrafficParticipant car) {

    }

    public void addTrafficParticipant(TrafficParticipant car) {
        Lane lane = lanes.get(car.getPosition().getCurrentLane());
        lane.addTrafficParticipant(car);
        trafficParticipants.add(car);
    }

    public double getLength() {
        return length;
    }

    public Node getExitNode() {
        return to;
    }

    public int getLanesNumber() {
        return lanes.size();
    }

    public Lane getLaneN(int n) {
        return lanes.get(n);

    }

    public int getTrafficParticipantsNumber() {
        return trafficParticipants.size();
    }

    public TrafficParticipant getTrafficParticipantN(int n) {
        return trafficParticipants.get(n);
    }

    public List<TrafficParticipant> getTrafficParticipants() {
        return trafficParticipants;
    }

    public void addLane(Lane lane) {

        lanes.add(lane);
    }

    public Node getFrom() {
        return from;
    }

    public Node getTo() {
        return to;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
