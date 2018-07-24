import java.util.Random;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class GraphGenerator{
    public static AdjacencyList generate(int qv, int qw){

        if((qw < (qv - 1)) || (qw > ((qv * (qv -1 )/2)))){
            System.out.println("!!!quantity of weight out of range!!!");
            return null;
        }

        AdjacencyList al = new AdjacencyList(qv);
        Random r = new Random();
        
        for(int i = 0; i < qv; i++){
            int a = r.nextInt(qv - 2) + 1;
            int b = 0;
            // System.out.println(i);

            al.add(new VertexList());
            al.get(i).add(0, new Vertex(i));

            do {
                int c = r.nextInt(qv - 1);
                int d = r.nextInt(qv - 1);
                if(c == i){
                    continue;
                }
                else{
                    al.get(i).addToEnd(new Vertex(c));
                }
                b++;
            } while(b != a);
        }

        return al;
    }
}

/*
printf_s("Кол-во элементов: %s, Затраченное время: кучи - %d, отображемые файлы - %d, базовые указатели - %d\n", cf, heapTime, mmapTime, baseTime); 

if(strlen(cf) == 3){ //1 | 16 4 17 17
    if((heapTime - 99) <= 0){ //2
        if((mmapTime - 99) <= 0){ //3
            if((baseTime - 9) <= 0){ //4
                printf_s("| %s|  %d|  %d|   %d|\n", cf, heapTime, mmapTime, baseTime);
            }
            else{ //4 
                if((baseTime - 99) <= 0){ //5
                    printf_s("| %s|  %d|  %d|  %d|\n", cf, heapTime, mmapTime, baseTime);
                }
                else{ //5
                    if((baseTime - 999) <= 0){ //6
                        printf_s("| %s|  %d|  %d| %d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                    else{ //6
                        printf_s("| %s|  %d|  %d|%d|", cf, heapTime, mmapTime, baseTime);
                    }
                }
            }
        }
        else{ //3 
            if((mmapTime - 999) <= 0){
                if((baseTime - 9) <= 0){ //4
                    printf_s("| %s|  %d| %d|   %d|\n", cf, heapTime, mmapTime, baseTime);
                }
                else{ //4 
                    if((baseTime - 99) <= 0){ //5
                        printf_s("| %s|  %d| %d|  %d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                    else{ //5
                        if((baseTime - 999) <= 0){ //6
                            printf_s("| %s|  %d| %d| %d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                        else{ //6
                            printf_s("| %s|  %d| %d|%d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                    }
                }
            }
            else{
                if((baseTime - 9) <= 0){ //4
                    printf_s("| %s|  %d|%d|   %d|\n", cf, heapTime, mmapTime, baseTime);
                }
                else{ //4 
                    if((baseTime - 99) <= 0){ //5
                        printf_s("| %s|  %d|%d|  %d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                    else{ //5
                        if((baseTime - 999) <= 0){ //6
                            printf_s("| %s|  %d|%d| %d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                        else{ //6
                            printf_s("| %s|  %d|%d|%d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                    }
                }
            }
        }
    }
    else{ //2 
        if((heapTime - 999) <= 0){
            if((mmapTime - 99) <= 0){ //3
                if((baseTime - 9) <= 0){ //4
                    printf_s("| %s| %d|  %d|   %d|\n", cf, heapTime, mmapTime, baseTime);
                }
                else{ //4 
                    if((baseTime - 99) <= 0){ //5
                        printf_s("| %s| %d|  %d|  %d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                    else{ //5
                        if((baseTime - 999) <= 0){ //6
                            printf_s("| %s| %d|  %d| %d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                        else{ //6
                            printf_s("| %s| %d|  %d|%d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                    }
                }
            }
            else{ //3 
                if((mmapTime - 999) <= 0){
                    if((baseTime - 9) <= 0){ //4
                        printf_s("| %s| %d| %d|   %d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                    else{ //4 
                        if((baseTime - 99) <= 0){ //5
                            printf_s("| %s| %d| %d|  %d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                        else{ //5
                            if((baseTime - 999) <= 0){ //6
                                printf_s("| %s| %d| %d| %d|\n", cf, heapTime, mmapTime, baseTime);
                            }
                            else{ //6
                                printf_s("| %s| %d| %d|%d|\n", cf, heapTime, mmapTime, baseTime);
                            }
                        }
                    }
                }
                else{
                    if((baseTime - 9) <= 0){ //4
                        printf_s("| %s| %d|%d|   %d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                    else{ //4 
                        if((baseTime - 99) <= 0){ //5
                            printf_s("| %s| %d|%d|  %d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                        else{ //5
                            if((baseTime - 999) <= 0){ //6
                                printf_s("| %s| %d|%d| %d|\n", cf, heapTime, mmapTime, baseTime);
                            }
                            else{ //6
                                printf_s("| %s| %d|%d|%d|\n", cf, heapTime, mmapTime, baseTime);
                            }
                        }
                    }
                }
            }
        }
        else{
            if((mmapTime - 99) <= 0){ //3
                if((baseTime - 9) <= 0){ //4
                    printf_s("| %s|%d|  %d|   %d|\n", cf, heapTime, mmapTime, baseTime);
                }
                else{ //4 
                    if((baseTime - 99) <= 0){ //5
                        printf_s("| %s|%d|  %d|  %d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                    else{ //5
                        if((baseTime - 999) <= 0){ //6
                            printf_s("| %s|%d|  %d| %d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                        else{ //6
                            printf_s("| %s|%d|  %d|%d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                    }
                }
            }
            else{ //3 
                if((mmapTime - 999) <= 0){
                    if((baseTime - 9) <= 0){ //4
                        printf_s("| %s|%d| %d|   %d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                    else{ //4 
                        if((baseTime - 99) <= 0){ //5
                            printf_s("| %s|%d| %d|  %d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                        else{ //5
                            if((baseTime - 999) <= 0){ //6
                                printf_s("| %s|%d| %d| %d|\n", cf, heapTime, mmapTime, baseTime);
                            }
                            else{ //6
                                printf_s("| %s|%d| %d|%d|\n", cf, heapTime, mmapTime, baseTime);
                            }
                        }
                    }
                }
                else{
                    if((baseTime - 9) <= 0){ //4
                        printf_s("| %s|%d|%d|   %d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                    else{ //4 
                        if((baseTime - 99) <= 0){ //5
                            printf_s("| %s|%d|%d|  %d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                        else{ //5
                            if((baseTime - 999) <= 0){ //6
                                printf_s("| %s|%d|%d| %d|\n", cf, heapTime, mmapTime, baseTime);
                            }
                            else{ //6
                                printf_s("| %s|%d|%d|%d|\n", cf, heapTime, mmapTime, baseTime);
                            }
                        }
                    }
                }
            }
        }
    }
}
else{ //1
    if((heapTime - 99) <= 0){ //2
        if((mmapTime - 99) <= 0){ //3
            if((baseTime - 9) <= 0){ //4
                printf_s("|%s|  %d|  %d|   %d|\n", cf, heapTime, mmapTime, baseTime);
            }
            else{ //4 
                if((baseTime - 99) <= 0){ //5
                    printf_s("|%s|  %d|  %d|  %d|\n", cf, heapTime, mmapTime, baseTime);
                }
                else{ //5
                    if((baseTime - 999) <= 0){ //6
                        printf_s("|%s|  %d|  %d| %d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                    else{ //6
                        printf_s("|%s|  %d|  %d|%d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                }
            }
        }
        else{ //3 
            if((mmapTime - 999) <= 0){
                if((baseTime - 9) <= 0){ //4
                    printf_s("|%s|  %d| %d|   %d|\n", cf, heapTime, mmapTime, baseTime);
                }
                else{ //4 
                    if((baseTime - 99) <= 0){ //5
                        printf_s("|%s|  %d| %d|  %d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                    else{ //5
                        if((baseTime - 999) <= 0){ //6
                            printf_s("|%s|  %d| %d| %d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                        else{ //6
                            printf_s("|%s|  %d| %d|%d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                    }
                }
            }
            else{
                if((baseTime - 9) <= 0){ //4
                    printf_s("|%s|  %d|%d|   %d|\n", cf, heapTime, mmapTime, baseTime);
                }
                else{ //4 
                    if((baseTime - 99) <= 0){ //5
                        printf_s("|%s|  %d|%d|  %d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                    else{ //5
                        if((baseTime - 999) <= 0){ //6
                            printf_s("|%s|  %d|%d| %d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                        else{ //6
                            printf_s("|%s|  %d|%d|%d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                    }
                }
            }
        }
    }
    else{ //2 
        if((heapTime - 999) <= 0){
            if((mmapTime - 99) <= 0){ //3
                if((baseTime - 9) <= 0){ //4
                    printf_s("|%s| %d|  %d|   %d|\n", cf, heapTime, mmapTime, baseTime);
                }
                else{ //4 
                    if((baseTime - 99) <= 0){ //5
                        printf_s("|%s| %d|  %d|  %d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                    else{ //5
                        if((baseTime - 999) <= 0){ //6
                            printf_s("|%s| %d|  %d| %d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                        else{ //6
                            printf_s("|%s| %d|  %d|%d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                    }
                }
            }
            else{ //3 
                if((mmapTime - 999) <= 0){
                    if((baseTime - 9) <= 0){ //4
                        printf_s("|%s| %d| %d|   %d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                    else{ //4 
                        if((baseTime - 99) <= 0){ //5
                            printf_s("|%s| %d| %d|  %d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                        else{ //5
                            if((baseTime - 999) <= 0){ //6
                                printf_s("|%s| %d| %d| %d|\n", cf, heapTime, mmapTime, baseTime);
                            }
                            else{ //6
                                printf_s("|%s| %d| %d|%d|\n", cf, heapTime, mmapTime, baseTime);
                            }
                        }
                    }
                }
                else{
                    if((baseTime - 9) <= 0){ //4
                        printf_s("|%s| %d|%d|   %d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                    else{ //4 
                        if((baseTime - 99) <= 0){ //5
                            printf_s("|%s| %d|%d|  %d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                        else{ //5
                            if((baseTime - 999) <= 0){ //6
                                printf_s("|%s| %d|%d| %d|\n", cf, heapTime, mmapTime, baseTime);
                            }
                            else{ //6
                                printf_s("|%s| %d|%d|%d|\n", cf, heapTime, mmapTime, baseTime);
                            }
                        }
                    }
                }
            }
        }
        else{
            if((mmapTime - 99) <= 0){ //3
                if((baseTime - 9) <= 0){ //4
                    printf_s("|%s|%d|  %d|   %d|\n", cf, heapTime, mmapTime, baseTime);
                }
                else{ //4 
                    if((baseTime - 99) <= 0){ //5
                        printf_s("|%s|%d|  %d|  %d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                    else{ //5
                        if((baseTime - 999) <= 0){ //6
                            printf_s("|%s|%d|  %d| %d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                        else{ //6
                            printf_s("|%s|%d|  %d|%d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                    }
                }
            }
            else{ //3 
                if((mmapTime - 999) <= 0){
                    if((baseTime - 9) <= 0){ //4
                        printf_s("|%s|%d| %d|   %d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                    else{ //4 
                        if((baseTime - 99) <= 0){ //5
                            printf_s("|%s|%d| %d|  %d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                        else{ //5
                            if((baseTime - 999) <= 0){ //6
                                printf_s("|%s|%d| %d| %d|\n", cf, heapTime, mmapTime, baseTime);
                            }
                            else{ //6
                                printf_s("|%s|%d| %d|%d|\n", cf, heapTime, mmapTime, baseTime);
                            }
                        }
                    }
                }
                else{
                    if((baseTime - 9) <= 0){ //4
                        printf_s("|%s|%d|%d|   %d|\n", cf, heapTime, mmapTime, baseTime);
                    }
                    else{ //4 
                        if((baseTime - 99) <= 0){ //5
                            printf_s("|%s|%d|%d|  %d|\n", cf, heapTime, mmapTime, baseTime);
                        }
                        else{ //5
                            if((baseTime - 999) <= 0){ //6
                                printf_s("|%s|%d|%d| %d|\n", cf, heapTime, mmapTime, baseTime);
                            }
                            else{ //6
                                printf_s("|%s|%d|%d|%d|\n", cf, heapTime, mmapTime, baseTime);
                            }
                        }
                    }
                }
            }
        }
    }
}
*/