import java.util.*;
class Solution {
    
    private static class Point{
    
        private final long x,y;
        private Point(long x, long y){
            this.x=x;
            this.y=y;
        }
    }
    
    private Point intersection(long a1,long b1, long c1, long a2, long b2, long c2){
        //교점 좌표 구히기
        double x= (double)(b1*c2-c1*b2)/(a1*b2-b1*a2);
        double y= (double)(c1*a2-a1*c2)/(a1*b2-b1*a2);
        
        if(x%1!=0||y%1!=0)return null;
        
        return new Point((long)x,(long)y);
    } 
    
    private Point searchMinPoint(List<Point> points){
        
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;
        
        for(Point p: points){
            
            x = x > p.x ? p.x : x;
            y = y > p.y ? p.y : y;
        }
        
        return new Point(x,y);
    }
    private Point searchMaxPoint(List<Point> points){
        
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        
       for(Point p: points){
            
            x = x < p.x ? p.x : x;
            y = y < p.y ? p.y : y;
        }
        
        return new Point(x,y);
    }
    
    public String[] solution(int[][] line) {
        
        //모든 직선 쌍에 대해 반복
        // -> 교점 구하기
        // -> 정수인 교점만 저장
        //모든 교점들로 x,y의 최소, 최대인 값을 구함
        //구한 값으로 2차원 배열 크기 결정
        //2차원 배열에 별 표시
        //문자열로 반환
        
        List<Point> points= new ArrayList<>();
        
        int len=line.length;
        
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                
                Point intersection=intersection(line[i][0],line[i][1],line[i][2],line[j][0],line[j][1],line[j][2]);

                if(intersection!=null) points.add(intersection);
            }
        }
        
        Point minPoint = searchMinPoint(points);
        Point maxPoint = searchMaxPoint(points);
                
        int width = (int) (maxPoint.x-minPoint.x+1);
        int heigth = (int) (maxPoint.y-minPoint.y+1);
        
        char[][] arr = new char[heigth][width];
        
        for(char []c: arr){
            Arrays.fill(c,'.');
        }
        
        for(Point p: points){
            int x= (int)(p.x-minPoint.x);
            int y= (int)(maxPoint.y-p.y);
            
            arr[y][x]='*';
        }
        
        String []result=new String[arr.length];
        
        for(int i=0;i<result.length;i++){
            result[i]=new String(arr[i]);
        }

        return result;
    }
}