class LockingTree {

   List<List<Integer>> adjList = new ArrayList<>();
    int[] lockedBy;
    int[] parent;

    public LockingTree(int[] parent) {
        int n = parent.length;
        this.lockedBy = new int[n];
        this.parent = parent;
        Arrays.fill(lockedBy, -1);
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 1; i < n; i++) {
            adjList.get(parent[i]).add(i);
        }
    }
    
    public boolean lock(int num, int user) {
        if (lockedBy[num] == -1) {
            lockedBy[num] = user;
            return true;
        }
        return false;
    }
    
    public boolean unlock(int num, int user) {
        int current = lockedBy[num];
        if (user == current) {
            lockedBy[num] = -1;
            return true;
        }
        return false;
    }
    
    public boolean upgrade(int num, int user) {
        if (lockedBy[num] != -1) {
            return false;
        }
        if (!hasLocks(num)) {
            return false;
        }
        if (hasAccendantLocked(num)) {
            return false;
        }
        lockedBy[num] = user;
        for (int neig : adjList.get(num)) {
            unlockDFS(neig);
        }
        return true;
    }

    private boolean hasAccendantLocked(int num) {
        if (num == -1) {
            return false;
        }
        if (lockedBy[num] != -1) {
            return true;
        }
        return hasAccendantLocked(parent[num]);
    }

    private void unlockDFS(int node) {
        lockedBy[node] = -1;
        for (int neig : adjList.get(node)) {
            unlockDFS(neig);
        }
    }

    private boolean hasLocks(int node) {
        if (lockedBy[node] != -1) {
            return true;
        }
        for (int neig : adjList.get(node)) {
            if (hasLocks(neig)) {
                return true;
            }
        }
        return false;
    }

}

/**
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */