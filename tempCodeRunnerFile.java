
            do { 
                next = (next%n)+1;
            } while (!visited[next]);
            visited[next] = false;
            count--;

            do { 
                i=(i%n)+1;
            } while (!visited[i]);
        }
        for(int j=1; j<=n; j++){