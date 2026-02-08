package DSA.Zoho2;

import java.util.*;

public class Program10 {
    public static void main(String[] args) {
        String [][] path={{"london","erode"},{"cbe","ooty"},{"erode","cbe"}};
        String [][]path2={{"B","C"},{"D","B"},{"C","A"},{"C","B"}};
        String [][]path3={{"A","Z"},{"Z","C"},{"C","X"},{"X","H"},{"X","Z"}};


        System.out.println(findCompletePath(path));
        System.out.println(findCompletePath(path2));
        System.out.println(findCompletePath(path3));


        //i computed the incoming and outgoing of all nodes
        // but only the outgoing is necessary and i need to find out the indegree and out degree of each nodes to get the start and end node
        // start  -> indegree 0;
        // end   -> outdegree 0;
        // with start i can move to the next valid node from current node
        // if a node is visited it is not considered to revisit again
        // finding the path from mentioned only one start node and only one end node !


    }

    public static String findCompletePath(String[][]path){
        Map<String,List<String>> neighbours=new HashMap<>();
        Set<String> points=new HashSet<>();
        for(String []data:path){
            points.add(data[1]);
            neighbours.computeIfAbsent(data[0],x-> new ArrayList<>()).add(data[1]);
        }
        String start=null;
        for (String[] p:path){
            if(!points.contains(p[0])){
                start=p[0];
                break;
            }
        }
        Set<String> visited=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        while(start!=null&&!visited.contains(start)){
            visited.add(start);
            sb.append(start+" -> ");
            List<String> nodes=neighbours.get(start);

            String next=null;
            if(nodes!=null){
                for(String node:nodes){
                    if(!visited.contains(node)){
                        next=node;
                        break;
                    }
                }
            }

            start=next;

        }

        sb.setLength(sb.length()-4);
        System.out.println(sb.toString());
        return "";
    }





//    public static String findCompletePath(String[][] path){
//        Map<String, List<String> >incoming=new HashMap<>();
//        Map<String,List<String>> outgoing=new HashMap<>();
//        Set<String> points=new HashSet<>();
//        for(String[] arr:path){
//            points.add(arr[0]);
//            points.add(arr[1]);
//            incoming.computeIfAbsent(arr[1],s -> new ArrayList<>()).add(arr[0]);
//            outgoing.computeIfAbsent(arr[0],s -> new ArrayList<>()).add(arr[1]);
//        }
//        Set<String> visited=new HashSet<>();
//        String start=null;
//        String end=null;
//        for(String s:points){
//            if(!incoming.containsKey(s)){
//                start=s;
//            }
//            if(!outgoing.containsKey(s)){
//                end=s;
//            }
//        }
//        StringBuilder sb=new StringBuilder();
//        if(start==null){
//            sb.append(end);
//            while(incoming.containsKey(end)){
//                if(visited.contains(end))break;
//                List<String> list=incoming.get(end);
//                visited.add(end);
//                for(String str:list){
//                    if(!visited.contains(str)){
//                        end=str;
//                        sb.insert(0,end+"->");
//                        break;
//                    }
//                }
//
//            }
//        }
//        else{
//            sb.append(start+"->");
//            while(outgoing.containsKey(start)){
//
//                List<String> list=outgoing.get(start);
//                visited.add(start);
//                for(String str:list){
//                    if(!visited.contains(str)){
//                        start=str;
//                        sb.append(start+"->");
//                        break;
//                    }
//                }
//
//            }
//        }
//        return sb.toString();
//    }
}

