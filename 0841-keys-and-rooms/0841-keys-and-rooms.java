 class Solution {
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {

            int ck[] = new int[rooms.size()];
            int vst[] = new int[rooms.size()];
            dfs(rooms,ck,vst, 0);

            vst[0] = 1;
            for (int i = 0; i < vst.length; i++) {
                if (vst[i] == 0) {
                    return false;
                }
            }
            return true;
            
        }
        void dfs(List<List<Integer>> rooms, int[]ck,int vst[], int roomNum ){

            List<Integer> list = rooms.get(roomNum);

            for (int i = 0; i < list.size(); i++) {
                Integer key = list.get(i);
                ck[key] = 1;
            }
            
            for (int i = 0; i < ck.length; i++) {
                if (ck[i] == 1 && vst[i] != 1) {
                    vst[i] = 1;
                    dfs(rooms,ck,vst, i);
                }
            }
        }
 }