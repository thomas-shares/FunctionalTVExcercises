(ns functional.tv-test
  (:require [clojure.test :as test]
            [functional.tv :as tv]))

(test/deftest a-test
  (test/testing "FIXME, I fail."
    (test/is (= 1 1))))

;; 20220529
(test/deftest reverse-words-test
  (test/testing ""
    (test/is (= "name my is Eric." (tv/reverse-words "Eric. is my name")))
    (test/is (= "hello" (tv/reverse-words "hello")))
    (test/is (= "you love I" (tv/reverse-words "I love you")))))

;; 20220715
(test/deftest regroup-license-plate 
  (test/testing ""
    (test/is (= "A-5GG-B88" (tv/regroup "A5-GG-B88" 3)))
    (test/is (= "A-5G-GB-88" (tv/regroup "A5-GG-B88" 2)))
    (test/is (= "67-76" (tv/regroup "6776" 2)))
    (test/is (= "F-3-3" (tv/regroup "F33" 1))) 
    (test/is (= "IIO" (tv/regroup "IIO" 7)))
                ))