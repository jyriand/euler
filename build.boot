(set-env!
 :source-paths #{"src/clj" "test/clj"}
 :dependencies '[[org.clojure/clojure "1.8.0"]
                 [adzerk/boot-test "1.1.1"]])

(require '[adzerk.boot-test :refer :all])
