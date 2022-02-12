(ns learn-clojure.core
  (:gen-class))

(defn -main
  "I am the description of this function!"
  [& args]
  (println "Hello, World!"))

;Coding Challenge #1
(defn petAge
    "Function to get human age of animals"
    [animal age]
    (def ageMap {'dog 7, 'cat 5, 'fish 10})
    (println animal "is" (* (get ageMap animal) age) "years old.") )
;(petAge 'cat 5)


;Coding Challenge #1
(defn isCouponValid
  [code]
  (defstruct coupon :code :discount)
  (def validCoupon (struct coupon "CAR20" 0.5))
  (if (= (:code validCoupon) code)
  true
  false)
  )

(defn carPrice
  [budget code]
  (def cars {'bmw 60000, 'ferrari 10000, "fiat" 20000})
  (if (isCouponValid code)
    (do
      (println "Coupon is valid")
      (def discount (:discount validCoupon))
      (doseq [car cars]
        (def carName (first car))
        (def carPrice (last car))
        (def discountedPrice (* carPrice discount))
        (if (<= discountedPrice budget)
          (println "The" carName "costs" discountedPrice)
        )
        ))
    (do
      (println "Coupon is invalid")
      (doseq [car cars]
        (def carName (first car))
        (def carPrice (last car))
        (if (<= carPrice budget)
          (println "The" carName "costs" carPrice)
          )
        )
        )
    ))
;(carPrice 9000 "CAR20")


;Coding Challenge #2
(def buyerAcc (ref 100))
(def merchantAcc (ref 0))
(def prices {'pen 1, 'notebook 5, 'backpack 10})
(def items (ref []))
(defn printDetails
  []
  (println "-- Balance --")
  (println "Buyer :" @buyerAcc)
  (println "Merchant :" @merchantAcc)
  (println "Items :" @items)
)
(defn buy [item]
  (def itemPrice (get prices item))
  (println itemPrice)

  (if (<= itemPrice @buyerAcc)
    (dosync
      (ref-set merchantAcc (+ @merchantAcc itemPrice))
      (ref-set buyerAcc (- @buyerAcc itemPrice))
      (def newItems (cons item @items))
      (ref-set items newItems)
      (printDetails)
    )
  ))

(buy 'pen)
(buy 'notebook)