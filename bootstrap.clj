(ns bootstrap
  (:require [figwheel.main.api]
            [cider-nrepl.main :as cider])
  (:import [java.lang.management ManagementFactory]))

(defn -main [& args]
  
  (cider/init ["cider.nrepl/cider-middleware"])
  (println "*********************"
    ;;(System/getenv)
    (.. ManagementFactory getRuntimeMXBean getInputArguments)
    )
  
  (figwheel.main.api/start "dev"))


