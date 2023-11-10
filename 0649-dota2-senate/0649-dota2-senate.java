class Solution {
    public String predictPartyVictory(String senate) {
        
        int n = senate.length();
        
        Queue<Integer> radiant = new LinkedList<>();
        
        Queue<Integer> dire = new LinkedList<>();

        // Separate the Radiant and Dire players into their respective queues
        for (int i = 0; i < n; i++) {
            
            if (senate.charAt(i) == 'R') {
                
                radiant.offer(i);
                
            } else {
                
                dire.offer(i);
                
            }
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {
            
            int radiantIndex = radiant.poll();
            
            int direIndex = dire.poll();

            if (radiantIndex < direIndex) {
                
                radiant.offer(radiantIndex + n); // This player will be banned in the next round
                
            } else {
                
                dire.offer(direIndex + n); // This player will be banned in the next round
                
            }
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}