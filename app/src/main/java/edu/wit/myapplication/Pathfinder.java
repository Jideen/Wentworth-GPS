package edu.wit.myapplication;

import android.util.Log;

import java.util.*;

/**
 * Pathfinder class calculates shortest path between two places
 */
public class Pathfinder {
    public static Set<Vertex> isIndexed = new HashSet<>(), notIndexed = new HashSet<>();

    /**
     * Vertex class creates building object
     */
    public class Vertex {
        List<Vertex> shortestPath = new LinkedList<>();
        Map<Vertex, Integer> adjacentVerts = new HashMap<>();
        Integer distTo = Integer.MAX_VALUE;
        String name;
        Building alias;


        public void addDestination(Vertex destination, int distance) {
            adjacentVerts.put(destination, distance);
        }

        public Vertex(Building a) {
            name = a.name;
            alias = a;
        }

        public void setDistance(Integer i) {
            this.distTo = i;
        }

        public void setShortestPath(List<Vertex> list) {
            this.shortestPath = list;
        }

        public List<Vertex> getShortestPath() {
            return shortestPath;
        }

        public Map<Vertex, Integer> getAdjacentVerts() {
            return adjacentVerts;
        }
    }

    /**
     * Calculates minimum distance
     *
     * @param edgeWeigh
     * @param evaluationNode
     * @param sourceNode
     */
    public static void CalculateMinimumDistance(Vertex evaluationNode,
                                                Integer edgeWeigh, Vertex sourceNode) {
        Integer sourceDistance = sourceNode.distTo;
        if (sourceDistance + edgeWeigh < evaluationNode.distTo) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<Vertex> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }

    /**
     * Calculates shortest path to next building vertex
     *
     * @param unsettledNodes
     */
    public static Vertex getLowestDistanceNode(Set<Vertex> unsettledNodes) {
        Vertex lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Vertex node : unsettledNodes) {
            int nodeDistance = node.distTo;
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    /**
     * Calculates shortest path between two places
     *
     * @param source
     */
    public static void calculateShortestPathFromSource(Vertex source) {
        source.setDistance(0);

        notIndexed.add(source);

        while (notIndexed.size() != 0) {
            Vertex currentVert = getLowestDistanceNode(notIndexed);
            notIndexed.remove(currentVert);
            for (Map.Entry<Vertex, Integer> adjacencyPair :
                    currentVert.getAdjacentVerts().entrySet()) {
                Vertex adjacentVert = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
                if (!isIndexed.contains(adjacentVert)) {
                    CalculateMinimumDistance(adjacentVert, edgeWeight, currentVert);
                    notIndexed.add(adjacentVert);
                }
            }
            isIndexed.add(currentVert);
        }
    }
    /**
     * Runs the pathfinder algorithm
     *
     * @param dest
     * @param source
     */
    public String[] run(String source, String dest) {
        Vertex Start = new Vertex(Constants.Buildings.EvansWay);
        Vertex Dest = new Vertex(Constants.Buildings.Beatty);
        Vertex EvansWay = new Pathfinder.Vertex(Constants.Buildings.EvansWay);
        Vertex Watson = new Pathfinder.Vertex(Constants.Buildings.Watson);
        Vertex Beatty = new Pathfinder.Vertex(Constants.Buildings.Beatty);
        Vertex Rubenstein = new Pathfinder.Vertex(Constants.Buildings.Rubenstein);
        Vertex Kingman = new Pathfinder.Vertex(Constants.Buildings.Kingman);
        Vertex Dobbs = new Pathfinder.Vertex(Constants.Buildings.Dobbs);
        Vertex Williston = new Pathfinder.Vertex(Constants.Buildings.Williston);
        Vertex Willson = new Pathfinder.Vertex(Constants.Buildings.Willson);
        Vertex Wentworth = new Pathfinder.Vertex(Constants.Buildings.Wentworth);
        Vertex Tudbury = new Pathfinder.Vertex(Constants.Buildings.Tudbury);
        switch (source) {
            case "evw":
                Start = EvansWay;
                break;
            case "wat":
                Start = Watson;
                break;
            case "bty":
                Start = Beatty;
                break;
            case "rub":
                Start = Rubenstein;
                break;
            case "king":
                Start = Kingman;
                break;
            case "dobb":
                Start = Dobbs;
                break;
            case "will":
                Start = Williston;
                break;
            case "wils":
                Start = Willson;
                break;
            case "went":
                Start = Wentworth;
                break;
            case "tdby":
                Start = Tudbury;
                break;
            case "empty":
                Start = EvansWay;
                break;
        }
        switch (dest) {
            case "evw":
                Dest = EvansWay;
                break;
            case "wat":
                Dest = Watson;
                break;
            case "bty":
                Dest = Beatty;
                break;
            case "rub":
                Dest = Rubenstein;
                break;
            case "king":
                Dest = Kingman;
                break;
            case "dobb":
                Dest = Dobbs;
                break;
            case "will":
                Dest = Williston;
                break;
            case "wils":
                Dest = Willson;
                break;
            case "went":
                Dest = Wentworth;
                break;
            case "tdby":
                Dest = Tudbury;
                break;
            case "empty":
                Dest = Beatty;
                break;
        }
        return run( EvansWay, Watson, Beatty, Rubenstein, Kingman, Dobbs, Williston, Willson, Wentworth, Tudbury,Start,Dest);
    }

    /**
     * Keeps a list of building vertices
     *
     * @param dest
     * @param source
     * @param bea
     * @param dob
     * @param evw
     * @param kin
     * @param rub
     * @param tud
     * @param wat
     * @param wen
     * @param wil
     * @param wili
     */
    public static String[] run(Vertex evw, Vertex wat, Vertex bea, Vertex rub, Vertex kin, Vertex dob, Vertex wili, Vertex wil, Vertex wen, Vertex tud, Vertex source, Vertex dest) {
        evw.addDestination(tud, 61);
        wat.addDestination(dob, 47);
        wat.addDestination(bea, 99);
        wat.addDestination(wat, 107);
        bea.addDestination(tud, 284);
        bea.addDestination(wil, 57);
        bea.addDestination(wat, 99);
        rub.addDestination(kin, 21);
        rub.addDestination(wili, 78);
        rub.addDestination(wen, 95);
        kin.addDestination(wil, 28);
        kin.addDestination(wen, 90);
        kin.addDestination(rub, 21);
        kin.addDestination(wat, 107);
        dob.addDestination(wen, 52);
        dob.addDestination(wat, 47);
        wili.addDestination(wen, 41);
        wili.addDestination(rub, 78);
        wil.addDestination(bea, 57);
        wil.addDestination(kin, 28);
        wil.addDestination(tud, 232);
        wen.addDestination(rub, 95);
        wen.addDestination(wili, 41);
        wen.addDestination(dob, 52);
        wen.addDestination(kin, 90);
        tud.addDestination(evw, 61);
        tud.addDestination(bea, 284);
        tud.addDestination(wil, 232);
        tud.addDestination(evw, 61);
        tud.addDestination(bea, 284);
        tud.addDestination(wil, 232);
        Vertex src = source;
        Vertex dst = dest;
        calculateShortestPathFromSource(src);
        ArrayList<String> s = new ArrayList<>();
        for (int i = 0; i < dst.shortestPath.size(); i++) {
            if(dst.shortestPath.get(i).alias.name.length()>2) {
                s.add(String.format("%s ", dst.shortestPath.get(i).alias.name));
            }
        }
        s.add(dst.name);
        System.out.println(String.format("%s", s.toArray().toString()));
        Log.i("Path result", String.format("%s", s.toArray().toString()));
        String[] oof = s.toArray(new String[s.size()]);
        return oof;
    }
}
