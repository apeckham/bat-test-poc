(defproject bat-test-poc "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :plugins [[metosin/bat-test "0.4.3"]]
  :main ^:skip-aot bat-test-poc.core
  :bat-test {:on-start bat-test-poc.bat/on-start
             :on-end bat-test-poc.bat/on-end}
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
