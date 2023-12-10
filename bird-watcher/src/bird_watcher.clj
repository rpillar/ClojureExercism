(ns bird-watcher)

(def last-week
    [0 2 5 3 7 8 4] 
  )

(defn today [birds]
    (last birds)	
  )

(defn inc-bird [birds]
    (assoc birds 
       (dec (count birds)) 
       (inc (last birds)))
  )

(defn day-without-birds? [birds]
    (contains? (set birds) 0)
  )

(defn n-days-count [birds n]
    (apply + (subvec birds 0 n))
  )

(defn busy-days [birds]
    (-> (filter (fn [x] (>= x 5)) birds)
    	(count))    
  )

(defn odd-week? [birds]
    (= (compare [1 0 1 0 1 0 1] birds) 0)
  )
