(ns euler.problem-1
  (:require [clojure.core.reducers :as r]))

;;
;; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
;;
;; Find the sum of all the multiples of 3 or 5 below 1000.
;;

(def input (range 1 1000))

(defn multiple-of-3-or-5? [number]
  (or (= (mod number 3) 0)
      (= (mod number 5) 0)))

(defn multiply-multiples [numbers]
  (r/fold + (r/filter multiple-of-3-or-5? numbers)))

(multiply-multiples input)
