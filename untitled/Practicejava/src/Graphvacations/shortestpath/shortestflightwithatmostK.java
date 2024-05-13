package Graphvacations.shortestpath;


import java.util.*;

class Flight{
    int price;
    int destination;

    Flight(int destination, int price){
       this.destination = destination;
       this.price = price;
    }

}

class Route{
    int stops;
    int first;
    int price;

    Route(int stops, int first, int price){
        this.stops = stops;
        this.first = first;
        this.price = price;

    }
}
public class shortestflightwithatmostK {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Flight>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < flights.length; i++){
           adj.get(flights[i][0]).add(new Flight(flights[i][1], flights[i][2]));
        }
        Queue<Route> q = new LinkedList<>();
        q.add(new Route(0, src, 0));
        int []price=new int[n];
        Arrays.fill(price,(int)(1e9));
        price[src]=0;
        while(!q.isEmpty()){
            Route route = q.poll();
            int stop=route.stops;
            int first=route.first;
            int cost=route.price;
            if(stop>k){
                continue;
            }
            for(Flight f: adj.get(first)){
                int p=f.price;
                int des=f.destination;

                if(p+cost<price[des] && stop<=k){
                    price[des]=p+cost;
                    q.add(new Route(stop+1, des, price[des]));
                }
            }
        }
        if(price[dst] == (int)(1e9)) return -1;
        return price[dst];
    }
}
