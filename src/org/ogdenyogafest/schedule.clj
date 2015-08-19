(ns org.ogdenyogafest.schedule)


(def days {:day-1 "Friday, October 9th"
           :day-2 "Saturday, October 10th"})

(def studio-a "Studio A")
(def studio-b "Studio B")
(def r119 "119")
(def cpr "CPR Room")
(def nutrition "Nutrition Room")

(def full-schedule
  [{:id "16041290"
    :day :day-1
    :time "4:30 – 5:00"
    :name "Registration"
    :comment ""
    :teacher-id ""
    :room studio-a
    :description ""}

   {:id "bc2351bf"
    :day :day-1
    :time "5:00 - 6:30"
    :name "Vimana Beginner's Hot Yoga"
    :comment ""
    :teacher-id "ac69c9a8"
    :room studio-a
    :description ""}

   {:id "a1a3f8d7"
    :day :day-1
    :time "5:00 - 6:30"
    :name "Prenatal yoga"
    :comment ""
    :teacher-id "6851f962"
    :room studio-b
    :description ""}

   {:id "dc13b1fc"
    :day :day-1
    :time "5:00 - 6:30"
    :name "Ashtanga"
    :comment ""
    :teacher-id "b348686b"
    :room r119
    :description ""}

   {:id "0273f78a"
    :day :day-1
    :time "5:00 - 6:30"
    :name "Meditaion"
    :comment ""
    :teacher-id "b45cb675"
    :room cpr
    :description ""}

   {:id "26276fa4"
    :day :day-1
    :time "5:00 - 6:30"
    :name "Introduction to Ayurvedic principles"
    :comment ""
    :teacher-id "e41898e1"
    :room nutrition
    :description ""}


   {:id "d444d575"
    :day :day-1
    :time "6:40– 8:10"
    :name "Intergral Yoga"
    :comment ""
    :teacher-id "49d5b485"
    :room studio-a
    :description ""}

   {:id "20437f5a"
    :day :day-1
    :time "6:40– 8:10"
    :name "Slo Mo Flow"
    :comment ""
    :teacher-id "8e04d8b8"
    :room studio-b
    :description ""}

   {:id "b2b91044"
    :day :day-1
    :time "6:40– 8:10"
    :name "Capoeira"
    :comment ""
    :teacher-id "469ce8d3"
    :room r119
    :description ""}

   {:id "c7d34400"
    :day :day-1
    :time "6:40– 8:10"
    :name "Let's Play Yoga"
    :comment ""
    :teacher-id "1b6bb10b"
    :room cpr
    :description ""}

   {:id "54607146"
    :day :day-1
    :time "6:40– 8:10"
    :name "Metaphysical healing and somatic Yoga"
    :comment ""
    :teacher-id "eb5d7b80"
    :room nutrition
    :description ""}


   {:id "abff5ccb"
    :day :day-1
    :time "8:20 – 9:20"
    :name "Intro to Japa Meditation"
    :comment ""
    :teacher-id "ac0b7188"
    :room studio-a
    :description ""}

   {:id "b9031365"
    :day :day-1
    :time "8:20 – 9:20"
    :name "Authentic Yoga - Being REAL In Your Practice"
    :comment ""
    :teacher-id "229aaa4d"
    :room studio-b
    :description ""}

   {:id "d1904057"
    :day :day-1
    :time "8:20 – 9:20"
    :name "Glowga"
    :comment ""
    :teacher-id "2c200bd4"
    :room r119
    :description ""}

   {:id "8fd1932d"
    :day :day-1
    :time "8:20 – 9:20"
    :name "Yoga Nidra"
    :comment ""
    :teacher-id "f1c42a98"
    :room cpr
    :description ""}


   {:id "60d8207e"
    :day :day-2
    :time "9:00 – 10:30"
    :name "Bandhas, Breath, and Movement"
    :comment ""
    :teacher-id "dc7fa83f"
    :room studio-a
    :description ""}

   {:id "6ad87588"
    :day :day-2
    :time "9:00 – 10:30"
    :name "Laughing Yoga"
    :comment ""
    :teacher-id "6851f962"
    :room studio-b
    :description ""}

   {:id "48396538"
    :day :day-2
    :time "9:00 – 10:30"
    :name "Artistic Yoga"
    :comment ""
    :teacher-id "49d5b485"
    :room r119
    :description ""}

   {:id "9237f456"
    :day :day-2
    :time "9:00 – 10:30"
    :name "Chakra Flow"
    :comment ""
    :teacher-id "d0c76716"
    :room cpr
    :description ""}

   {:id "877255ab"
    :day :day-2
    :time "9:00 – 10:30"
    :name "Prana, Tejas, and Ojas"
    :comment ""
    :teacher-id "e41898e1"
    :room nutrition
    :description ""}


   {:id "6660fea5"
    :day :day-2
    :time "10:40 – 12:10"
    :name "Vinyasa flow"
    :comment ""
    :teacher-id "c33c4a13"
    :room studio-a
    :description ""}

   {:id "2bb2a27f"
    :day :day-2
    :time "10:40 – 12:10"
    :name "Chair yoga"
    :comment ""
    :teacher-id "d1cd5b5b"
    :room studio-b
    :description ""}

   {:id "e42e2fbf"
    :day :day-2
    :time "10:40 – 12:10"
    :name "Back bending Workshop"
    :comment ""
    :teacher-id "b348686b"
    :room r119
    :description ""}

   {:id "f3b1e0b8"
    :day :day-2
    :time "10:40 – 12:10"
    :name "Mandala Namaskar"
    :comment ""
    :teacher-id "ccd41d5b"
    :room cpr
    :description ""}

   {:id "1ffcaef3"
    :day :day-2
    :time "10:40 – 12:10"
    :name "Meditation/stress management workshop"
    :comment ""
    :teacher-id "b3c4c4a7"
    :room nutrition
    :description ""}


   {:id "1ffa6c3b"
    :day :day-2
    :time "12:10 – 1:00"
    :name "Lunch"
    :comment "(chanting)"
    :teacher-id ""
    :room "Lobby"
    :description ""}


   {:id "4df4fda4"
    :day :day-2
    :time "1:00 – 2:30"
    :name "Forrest yoga"
    :comment ""
    :teacher-id "e14ac600"
    :room studio-a
    :description ""}

   {:id "d2c873ba"
    :day :day-2
    :time "1:00 – 2:30"
    :name "Partner yoga"
    :comment ""
    :teacher-id "9d35c244"
    :room studio-b
    :description ""}

   {:id "1cfeaae9"
    :day :day-2
    :time "1:00 – 2:30"
    :name "Vimana Hot Fusion"
    :comment ""
    :teacher-id "4e662717"
    :room r119
    :description ""}

   {:id "612c6b83"
    :day :day-2
    :time "1:00 – 2:30"
    :name "Yin"
    :comment ""
    :teacher-id "0501d2ee"
    :room cpr
    :description ""}

   {:id "4e405416"
    :day :day-2
    :time "1:00 – 2:30"
    :name "Yoga in the Kitchen"
    :comment ""
    :teacher-id "08bd27a9"
    :room nutrition
    :description ""}


   {:id "3c96df90"
    :day :day-2
    :time "2:40 – 4:10"
    :name "Hips, Hamstring and Hand Balances"
    :comment ""
    :teacher-id "0ef6d9b2"
    :room studio-a
    :description ""}

   {:id "2a0f8200"
    :day :day-2
    :time "2:40 – 4:10"
    :name "Your Sacral Center: Yoga Practice for a Healthy Sacroiliac Joint"
    :comment ""
    :teacher-id "6f4a57a0"
    :room studio-b
    :description ""}

   {:id "cafaeefd"
    :day :day-2
    :time "2:40 – 4:10"
    :name "Kalari"
    :comment ""
    :teacher-id "e52818a1"
    :room r119
    :description ""}

   {:id "aa84c468"
    :day :day-2
    :time "2:40 – 4:10"
    :name "Yin"
    :comment ""
    :teacher-id "aab34827"
    :room cpr
    :description ""}

   {:id "8e4429e1"
    :day :day-2
    :time "2:40 – 4:10"
    :name "Raw food"
    :comment ""
    :teacher-id "0501d2ee"
    :room nutrition
    :description ""}


   {:id "938c70aa"
    :day :day-2
    :time "4:20 – 5:50"
    :name "Restore"
    :comment ""
    :teacher-id "f1c42a98"
    :room studio-a
    :description ""}

   {:id "20fbc1cd"
    :day :day-2
    :time "4:20 – 5:50"
    :name "Yoga and writing from the soul"
    :comment ""
    :teacher-id "d69ea7f2"
    :room studio-b
    :description ""}

   {:id "0359915e"
    :day :day-2
    :time "4:20 – 5:50"
    :name "Meditation"
    :comment ""
    :teacher-id "ccd41d5b"
    :room r119
    :description ""}

   {:id "30b4c13a"
    :day :day-2
    :time "4:20 – 5:50"
    :name "Mandalas, Malas and Meditation"
    :comment ""
    :teacher-id "d0c76716"
    :room cpr
    :description ""}

   ])
