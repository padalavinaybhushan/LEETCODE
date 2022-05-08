 public class NestedIterator implements Iterator<Integer> {
        List<Integer> numList;
        int idx;

        public NestedIterator(List<NestedInteger> nestedList) {
            numList = new ArrayList<>();
            idx = 0;
            dfs(nestedList);
        }

        private void dfs(List<NestedInteger> nestedList) {
            if (nestedList == null) {
                return;
            }

            for (int i = idx; i < nestedList.size(); i++) {
                NestedInteger nested = nestedList.get(i);
                if (nested.isInteger()) {
                    numList.add(nested.getInteger());
                } else {
                    dfs(nested.getList());
                }
            }
        }

        @Override
        public Integer next() {
            return numList.get(idx++);
        }

        @Override
        public boolean hasNext() {
            if (idx < numList.size()) {
                return true;
            }

            return false;
        }
    }