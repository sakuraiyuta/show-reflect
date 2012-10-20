(ns show-reflect.core
  (:use
    [clojure.pprint
     :only [print-table]]
    [clojure.reflect
     :only [reflect]]
    [clojure.set
     :only [select]]))

(defn show-reflect
  ""
  [obj]
  (print-table
    (sort-by
      :name
      (:members (reflect obj)))))

