(ns org.ogdenyogafest.schedule)

(def days {:day-1 "Friday, October 9th"
           :day-2 "Saturday, October 10th"})

(def studio-a "Studio A")
(def studio-b "Studio B")
(def r119 "119")
(def cpr "229")
(def nutrition "238")
(def pool "Pool")
(def lobby "Lobby")

(def full-schedule
  [{:id "16041290"
    :day :day-1
    :time "4:30 – 5:00"
    :name "Registration"
    :comment ""
    :teacher-id ""
    :room lobby
    :description (str "")}

   {:id "bc2351bf"
    :day :day-1
    :time "5:00 - 6:30"
    :name "Vimana Beginner's Hot Yoga"
    :comment ""
    :teacher-id "ac69c9a8"
    :room studio-a
    :description (str
                  "Welcome to Beginning Vimana Yoga® for all levels. The most "
                  "effective, hard-working, and restorative Yoga class in the "
                  "world. Sweat, stretch, laugh, and do more for your health, "
                  "body, and general well-being than you ever imagined "
                  "possible when you practice Hot Vimana Yoga® created by "
                  "world renowned teachers, Bel and Emily Carpenter. Vimana "
                  "Yoga® combines hundreds of postures from several styles of "
                  "yoga including Bikram, Forrest, Para, Ashtanga, and Vinyasa "
                  "Yoga.")}

   {:id "a1a3f8d7"
    :day :day-1
    :time "5:00 - 6:30"
    :name "Prenatal yoga"
    :comment ""
    :teacher-id "6851f962"
    :room studio-b
    :description (str
                  "Learn breathing techniques and stretches to ease pregnancy "
                  "and prepare for labor. Doing yoga helps increase "
                  "flexibility, builds strength, and reduces stress. "
                  "Beginners and all levels welcome.")}

   {:id "dc13b1fc"
    :day :day-1
    :time "5:00 - 6:30"
    :name "Ashtanga"
    :comment ""
    :teacher-id "b348686b"
    :room r119
    :description (str
                  "A challenging, dynamic, body and mind-balancing "
                  "prescription for strength and flexibility. "
                  "Breath-synchronized movement is used to create heat to "
                  "help increase flexibility and purify the body. Ashtanga "
                  "addresses the push muscles and back core, which makes it "
                  "great opposition training for climbers.")}

   {:id "0273f78a"
    :day :day-1
    :time "5:00 - 6:30"
    :name "Meditaion"
    :comment ""
    :teacher-id "b45cb675"
    :room cpr
    :description (str
                  "Take a moment to just sit in silence using zazen "
                  "techniques to focus your mind on the present moment. Learn "
                  "how to use breath counting to gain control of your "
                  "thoughts and help prevent wandering of the mind. We will "
                  "also explore vairous sitting styles to help maintain a "
                  "proper posture and protect our knees.")}

   {:id "26276fa4"
    :day :day-1
    :time "5:00 - 6:30"
    :name "Introduction to Ayurvedic principles"
    :comment ""
    :teacher-id "e41898e1"
    :room nutrition
    :description (str
                  "In this workshop we will be going over (Sankya), the "
                  "philosophical back ground that Ayurveda is based on. "
                  "We will build an understanding of the elements and how "
                  "they relate to our everyday day life.  We will address how "
                  "we can use simple tools of Ayurveda right away to bring "
                  "more harmony to the body, mind and soul. We will help you "
                  "have a greater understanding of your own elemental "
                  "constitution and what you can do with that insight to find "
                  "more peace with your elements.")}

   {:id "cce07f06"
    :day :day-1
    :time "5:00 - 6:30"
    :name "SUP Yoga"
    :comment "(Swimwear and pre-registration required)"
    :teacher-id "1b6bb10b"
    :room pool
    :description (str
                  "Paddle Board Yoga is a variation of stand up paddle surfing "
                  "(SUP), combined with yoga, which originated in Rishikesh, "
                  "India. The sport combines hatha yoga and vinyasa yoga "
                  "asanas, or poses, with surfing.")}


   {:id "d444d575"
    :day :day-1
    :time "6:40– 8:10"
    :name "Intergral Yoga"
    :comment ""
    :teacher-id "49d5b485"
    :room studio-a
    :description (str
                  "Integral Yoga is a free form yoga style that is great for "
                  "increasing flexibility. It includes spine warmers "
                  "(namaskars), and variations on poses, such as; laterals, "
                  "twists, asymmetries, and partial postures in order to "
                  "access all the parts of the body and leave the student "
                  "feeling unblocked and free.")}

   {:id "20437f5a"
    :day :day-1
    :time "6:40– 8:10"
    :name "Slo Mo Flow"
    :comment ""
    :teacher-id "8e04d8b8"
    :room studio-b
    :description (str
                  "The essence of yoga is using the breath to link the mind "
                  "and the body. However, this link is easily broken if you "
                  "are moving too quickly and panting for breath. In this slo "
                  "mo flow, you will move slowly and continuously, guided "
                  "only by your breath, through a series of moves that "
                  "spirals from easy to more challenging. This practice will "
                  "take you deeply inside yourself, and leave you feeling "
                  "calm and refreshed.")}

   {:id "b2b91044"
    :day :day-1
    :time "6:40– 8:10"
    :name "Capoeira"
    :comment ""
    :teacher-id "469ce8d3"
    :room r119
    :description (str
                  "Capoeira classes are developed around traditional Capoeira "
                  "ground movements, kicks, and acrobatics and focuses on "
                  "physical conditioning and development. These movements are "
                  "developed through sequences and combinations which are "
                  "apply to the game of Capoeira. Students are able to grow "
                  "and develop their game in the roda, the circle used to "
                  "fight another player, by challenging each other in various "
                  "situations. Students are expected to learn traditional "
                  "songs and instruments through which they will gain a "
                  "greater understanding of the Portuguese language and "
                  "Brazilian culture.")}

   {:id "c7d34400"
    :day :day-1
    :time "6:40– 8:10"
    :name "Let's Play Yoga"
    :comment ""
    :teacher-id "1b6bb10b"
    :room cpr
    :description (str
                  "This class would utilize Yoga Blocks, Straps, small hand "
                  "weights, and stability ball. Using the \"toys\" to create "
                  "fun accessible Yoga and some challenging asanas as well.")}

   {:id "54607146"
    :day :day-1
    :time "6:40– 8:10"
    :name "Metaphysical healing and somatic Yoga"
    :comment ""
    :teacher-id "eb5d7b80"
    :room nutrition
    :description (str
                  "In this lecture we will revolve around a collection of "
                  "concepts regarding how an individual may effectively heal "
                  "themselves through a somatic employment of Yogic practices "
                  "and an understanding of the nature of our dimensional "
                  "octave. Included within this collection of concepts are "
                  "the following: psychosomatics, the fascial matrix, the 12 "
                  "layers of DNA, the auric field, psychological "
                  "re-patterning, neuroanatomy, postural correction, and the "
                  "creation of one's reality.")}


   {:id "abff5ccb"
    :day :day-1
    :time "8:20 – 9:20"
    :name "Intro to Japa Meditation"
    :comment ""
    :teacher-id "ac0b7188"
    :room studio-a
    :description (str
                  "Japa is an ancient form of meditation using vocal mantra "
                  "repetition & mala beads. This class will begin with "
                  "open-discussion on traditional chants, Sanskrit, mala, "
                  "followed by a light & soothing asana/yoga practice before "
                  "easing into Japa meditation. Informational & experiential. "
                  "vBring mala beads if available.")}

   {:id "b9031365"
    :day :day-1
    :time "8:20 – 9:20"
    :name "Authentic Yoga - Being REAL In Your Practice"
    :comment ""
    :teacher-id "229aaa4d"
    :room studio-b
    :description (str
                  "All bodies are different and unique and so should the way "
                  "you practice yoga. Accepting and honoring where you are at "
                  "physically, and practicing yoga accordingly, will promote "
                  "long term health and well being. Yoga can be for everyone! "
                  "Poses done with the focus solely on flexibility and not "
                  "stability can result in degeneration of the joints and "
                  "chronic pain.<br>"
                  "<br>"
                  "In this class Jan will teach you how to practice your "
                  "favorite yoga poses authentically, in a way that will "
                  "stabilize and support your joints.  After a short yoga "
                  "practice implementing what you have just learned, you will "
                  "enjoy a special guided relaxation focused on self care, "
                  "that will leave you feeling empowered and renewed.<br>"
                  "<br>"
                  "Support, stabilize and renew the REAL you!")}

   {:id "d1904057"
    :day :day-1
    :time "8:20 – 9:20"
    :name "Glowga"
    :comment ""
    :teacher-id "2c200bd4"
    :room r119
    :description (str
                  "This class is a fun all-level yoga class under black "
                  "lights! We have some glow in the dark body paint "
                  "available, and feel free to bring your own. Be sure to "
                  "arrive a few minutes early for a body paint party! White "
                  "and lighter colored yoga clothes and glow bracelets work "
                  "well under the black lights. We are very excited to "
                  "announce that the music for this class will be provided by "
                  "our very own live DJ, Jason Keifer (DJ Nourish). His "
                  "amazing beats along with the glowing yoga will leave you "
                  "in a good mood for days.")}

   {:id "8fd1932d"
    :day :day-1
    :time "8:20 – 9:20"
    :name "Yoga Nidra"
    :comment ""
    :teacher-id "f1c42a98"
    :room cpr
    :description (str
                  "In this Yoga Nidra Session, we aim to leave the Waking "
                  "state, go past the Dreaming state, and go to Deep Sleep, "
                  "yet remain awake. While Yoga Nidra is a state that is very "
                  "relaxing, it is also used by Yogis to purify the "
                  "Samskaras, the deep impressions that are the driving force "
                  "behind Karma. This practice will bring awareness of "
                  "Samskaras through the five main Koshas, or layers of "
                  "being.")}


   {:id "60d8207e"
    :day :day-2
    :time "9:00 – 10:30"
    :name "Bandhas, Breath, and Movement"
    :comment ""
    :teacher-id "dc7fa83f"
    :room studio-a
    :description (str "")}

   {:id "6ad87588"
    :day :day-2
    :time "9:00 – 10:30"
    :name "Laughing Yoga"
    :comment ""
    :teacher-id "6851f962"
    :room studio-b
    :description (str
                  "Fake it til you make it, laughing is contagious! There are "
                  "numerous health benefits to laughing. We will start with "
                  "some exercises to open up communication and break down "
                  "inhibitions, then end with some playful asana practice. "
                  "Bring your inner child. All levels welcome.")}

   {:id "48396538"
    :day :day-2
    :time "9:00 – 10:30"
    :name "Artistic Yoga"
    :comment ""
    :teacher-id "49d5b485"
    :room r119
    :description (str
                  "Artistic Yoga™ is a yoga method for the modern person that "
                  "is a style of Integral Yoga. It has its own technique of "
                  "timing, passages, links, aesthetic asana, mudra (gesture), "
                  "gaze, energy control, introspection, and meditation. It "
                  "has been called a poem made by the body. It simulates a "
                  "cascade of yoga poses, and is a beautiful moving "
                  "meditation. It induces a connection to spiritual and "
                  "artistic expression through the execution of the series. "
                  "Artistic Yoga™ is the link between art and yoga. It is "
                  "based on the notion that “Art is the purest form of "
                  "spiritual expression.<br>"
                  "<br>"
                  "Visit our YouTube page to watch Artistic Yoga Performances "
                  "by students and teachers of the Integrated School of Yoga. "
                  "https://www.youtube.com/user/artisticyogausa<br>"
                  "<br>"
                  "Let's Play Yoga! This class would utilize Yoga Blocks, "
                  "Straps, small hand weights, and stability ball. Using the "
                  "\"toys\" to create fun accessible Yoga and some "
                  "challenging asanas as well. I will definitely need a room "
                  "with walls with no bars or mirrors to interfere. I prefer "
                  "to teach this during a morning time slot.")}

   {:id "9237f456"
    :day :day-2
    :time "9:00 – 10:30"
    :name "Chakra Flow"
    :comment ""
    :teacher-id "d0c76716"
    :room cpr
    :description (str
                  "In this vinyasa flow sequence, identify the 7 chakras and "
                  "poses designed to stimulate each. Starting with the root "
                  "chakra and working our way up to the crown -- flowing from "
                  "one chakra to the next, holding some postures for up to a "
                  "minute. Ending with a 10-minute chakra body scan "
                  "meditation/savasana.")}

   {:id "877255ab"
    :day :day-2
    :time "9:00 – 10:30"
    :name "Prana, Tejas, and Ojas"
    :comment ""
    :teacher-id "e41898e1"
    :room nutrition
    :description (str
                  "Prana, tejas, ojas are the subtle forms of vata pitta and "
                  "kapha. They exist in our consciousness more then the body. "
                  "They directly effect how we experience life. Learning the "
                  "balance of these three energies is essential for a deeper "
                  "practice of Yoga. Too much or too little Prana, Tejas, or "
                  "Ojas can be a detrimental barrier to yoga. Come find out "
                  "why and develop a greater understanding to where you are "
                  "personally within that balance.")}


   {:id "6660fea5"
    :day :day-2
    :time "10:40 – 12:10"
    :name "Free Your Flow Vinyasa"
    :comment ""
    :teacher-id "c33c4a13"
    :room studio-a
    :description (str
                  "Nothing is certain and change is inevitable. So, why not "
                  "release expectations, trust yourself and go with the flow? "
                  "In this session we’ll break down all the pieces of a "
                  "sweet, steady vinyasa. We’ll play with creative "
                  "sequencing, fluid transitions and progressive music that "
                  "will help you sync with your own internal rhythm. In the "
                  "end it’s all put together for a dynamic, smooth, "
                  "continuous flow.<br>"
                  "<br>"
                  "Leave inhibitions behind and come play!")}

   {:id "2bb2a27f"
    :day :day-2
    :time "10:40 – 12:10"
    :name "Chair yoga"
    :comment ""
    :teacher-id "d1cd5b5b"
    :room studio-b
    :description (str
                  "A series of yoga moves modified for chair keeps you off "
                  "the floor.  No mat required, loose and comfortable street "
                  "clothes are fine. You will learn how you can do yoga "
                  "anywhere, including the office, home, park bench, anywhere "
                  "you have a chair and a little space! With a focus on "
                  "breath and movement while using the chair for stability, "
                  "chair yoga can be as easy or challenging as you desire. "
                  "This class is suitable for all levels.")}

   {:id "e42e2fbf"
    :day :day-2
    :time "10:40 – 12:10"
    :name "Back bending Workshop"
    :comment ""
    :teacher-id "b348686b"
    :room r119
    :description (str "")}

   {:id "f3b1e0b8"
    :day :day-2
    :time "10:40 – 12:10"
    :name "Mandala Namaskar"
    :comment ""
    :teacher-id "ccd41d5b"
    :room cpr
    :description (str
                  "Mandalas are used in various spiritual traditions as a "
                  "vehicle for focusing attention. By using a mandala "
                  "movement during yoga practice, a yogi is able to flow more "
                  "and more easily through the sacred space on the mat, "
                  "becoming one with the breath and the body.")}

   {:id "1ffcaef3"
    :day :day-2
    :time "10:40 – 12:10"
    :name "Meditation/stress management workshop"
    :comment ""
    :teacher-id "b3c4c4a7"
    :room nutrition
    :description (str
                  "In this workshop, you will learn a simple and very "
                  "powerful method of meditation. Based on transcendental "
                  "meditation, this workshop will teach you a way to meditate "
                  "so you can quiet your mind, realize real relaxation, and "
                  "create a healing environment for your mind/body. By the "
                  "end of this workshop, you'll be an expert meditator.")}


   {:id "1ffa6c3b"
    :day :day-2
    :time "12:10 – 1:00"
    :name "Lunch"
    :comment "(Kirtan)"
    :teacher-id ""
    :room lobby
    :description (str "")}


   {:id "4df4fda4"
    :day :day-2
    :time "1:00 – 2:30"
    :name "Forrest yoga"
    :comment ""
    :teacher-id "e14ac600"
    :room studio-a
    :description (str
                  "Forrest Yoga is renowned as an intensely physical and "
                  "internally focused practice, developed by Ana Forrest. She "
                  "writes, \"I developed Forrest Yoga as I was working "
                  "through my own healing.  I took poses and modified or "
                  "created new ones to address today’s lifestyle physical "
                  "ailments. For example, the ailments that our bodies are "
                  "manifesting due to our lifestyle – lower and upper back "
                  "pain, neck and shoulder issues, carpal tunnel syndrome, "
                  "intestinal disorders.\" The practice challenges students "
                  "to access their whole being and to use Forrest Yoga as a "
                  "path to finding and then cleansing the emotional and "
                  "mental blocks that dictate and limit their lives. Students "
                  "cultivate an acute awareness of their own practice and "
                  "life process, creating a unique and powerful opportunity "
                  "for them to make practical life decisions based on their "
                  "own experiences.<br>"
                  "<br>"
                  "\"Forrest Yoga is based in the rich practice of yoga from "
                  "the east, but applied for the western lifestyle.\" - Ana "
                  "T. Forrest")}

   {:id "d2c873ba"
    :day :day-2
    :time "1:00 – 2:30"
    :name "Partner yoga"
    :comment ""
    :teacher-id "9d35c244"
    :room studio-b
    :description (str
                  "Explore poses on a deeper and more playful level while "
                  "using a partner for support.<br>"
                  "<br>"
                  "Join us in this all levels workshop to learn how to do "
                  "asanas (postures) with assists from your partner. "
                  "Practicing yoga postures with a friend, loved one, or a "
                  "new acquaintance deepens our understanding of yoga and our "
                  "awareness of others.<br>"
                  "<br>"
                  "This partner yoga class will be a fun way to bring "
                  "playful energy, balance, and trust into new and "
                  "challenging poses. Come alone or come with a friend to "
                  "enjoy this unique perspective on yoga.")}

   {:id "1cfeaae9"
    :day :day-2
    :time "1:00 – 2:30"
    :name "Vimana Hot Fusion"
    :comment ""
    :teacher-id "4e662717"
    :room r119
    :description (str
                  "Inspired by our Vimana Fusion Teacher Training with "
                  "renowned Yogi's, Bel and Emily Carpenter, this 70 minute "
                  "class is designed for all levels and combines elements of "
                  "traditional Hot Yoga and Power Yoga. It encompasses the "
                  "meditative and detoxifying qualities of Hot Yoga with the "
                  "intensity of Power Yoga and while strengthening the upper "
                  "body and core it also has deep hip openers and inversions. "
                  "This is a super fun class and will leave you feeling "
                  "energized and refreshed!")}

   {:id "612c6b83"
    :day :day-2
    :time "1:00 – 2:30"
    :name "Yin"
    :comment ""
    :teacher-id "0501d2ee"
    :room cpr
    :description (str
                  "Yin Yoga is on the restorative side of the yoga spectrum "
                  "and is performed to stretch the connective tissues of the "
                  "body. Primary connective tissues include the hips, thighs "
                  "and lower spinal area. These types of tissues do not "
                  "stretch the muscles (as in the yang form of yoga) but they "
                  "stretch and exercise the bone and joints areas of the "
                  "body. This type of asana practice is beneficial to a wide "
                  "variety of people. Yin yoga is a perfect match for yang "
                  "yoga, and provides a deeper stretch. Although yin yoga is "
                  "not as intense as other yang forms of yoga, its long "
                  "holds, 3 to 5 minutes, can be challenging in its own "
                  "right.")}

   {:id "4e405416"
    :day :day-2
    :time "1:00 – 2:30"
    :name "Yoga in the Kitchen"
    :comment ""
    :teacher-id "08bd27a9"
    :room nutrition
    :description (str
                  "Food was not always my friend, can you relate? I grew up "
                  "with family meals and with an awareness of the demon "
                  "\"sugar\".  My dad was a holistic chiropractor, a rare "
                  "breed in the 60s. We had no junk food and sugar in our "
                  "home. Well that is till he died in 1966 (accident, not "
                  "health 'sugar' related). Welcome sugar, canned macaroni "
                  "and cheese and well, home cooked meals, greens? I don’t "
                  "think so! So the food roller coaster began and I "
                  "struggled for years and years not understanding the "
                  "connection between my intake of food and my fluctuating "
                  "mood and energy swings. I could not concentrate in "
                  "school, was labeled a slow learner, really? My life "
                  "continued to ebb and flow with instability. Yes I know my "
                  "life experience did play a role in this however, would it "
                  "have been different if my food was different. YOU BET! But "
                  "the contrast helps me write to you today.<br>"
                  "<br>"
                  "Food is now my friend. I realize that everything I put "
                  "into my body becomes part of me. So that I am actually "
                  "\"walking food\". And it is not just about \"what goes "
                  "in\" but, \"how it is prepared\". Yes cooking is like "
                  "yoga to me. It is a spiritual creative experience. I don't "
                  "always know what I'm doing. Do you? But I try anyway and "
                  "experiment. So one of my experiments came out ok. The "
                  "\"Chia Pet Bean Burger\". I came up with this recipe when "
                  "I was doing a \"liver cleanse\"--don’t ask! So no meat and "
                  "dairy on this cleanse (duh), but I am hypoglycemic so I "
                  "need protein! Mmmmmmm beans, rice, hemp seeds, chia seeds, "
                  "onions, garlic, cilantro, spices, wa-lah a burger was "
                  "born! I do my yoga in the kitchen. Maybe this was power "
                  "yoga that day. I prefer restore, makes better soup! I made "
                  "a big batch, froze the leftovers and continued on my liver "
                  "cleanse.<br>"
                  "<br>"
                  "One of the quotes from the nutrition school I attended in "
                  "NYC was \"cook like your life depended on it, because it "
                  "does\" I really disliked that quote when I was not cooking "
                  "and preparing my food. But now I get it. So just begin, "
                  "baby steps, maybe make one thing today or tomorrow. Make a "
                  "little extra so you can have more meals. Connect with the "
                  "food, breathe, look at the food, feel it, it is quite "
                  "miraculous some of these edible life healing morsels from "
                  "Mother Earth. Feel gratitude and begin your own “yoga in "
                  "the kitchen.<br>"
                  "<br>"
                  "Namaste’ and Bon Appetite! ~Pati")}


   {:id "3c96df90"
    :day :day-2
    :time "2:40 – 4:10"
    :name "Hips, Hamstring and Hand Balances"
    :comment ""
    :teacher-id "0ef6d9b2"
    :room studio-a
    :description (str
                  "Join us for this alignment based Anusara yoga class. Open "
                  "your hamstrings, align your hips, balance on your hands and "
                  "uplift your spirit with this playful all level practice.")}

   {:id "2a0f8200"
    :day :day-2
    :time "2:40 – 4:10"
    :name "Your Sacral Center: Yoga Practice for a Healthy Sacroiliac Joint"
    :comment ""
    :teacher-id "6f4a57a0"
    :room studio-b
    :description (str
                  "Your sacroiliac (SI) joint is the center point of your "
                  "structure. It is the pivotal joint between the upper and "
                  "lower body. It is also the site of the most common "
                  "injuries in yoga. Some popular alignment instructions can "
                  "actually contribute to SI dysfunction, because they are "
                  "based more on how a pose looks than on how your skeleton "
                  "is designed. In this class you will learn how the SI joint "
                  "and the rest of the spine are designed to move, and how to "
                  "fashion an asana practice that reflects the natural "
                  "movements of the spine. Knowing how to move intelligently "
                  "creates stability and ease in the body and mind.")}

   {:id "cafaeefd"
    :day :day-2
    :time "2:40 – 4:10"
    :name "Kalari Movement"
    :comment "(Co-taught by <a href=\"/teacher/c0de6ae2\">Heather Jones</a>)"
    :teacher-id "e52818a1"
    :room r119
    :description (str
                  "In this workshop, Ardyce and Heather will introduce Kalari "
                  "Movement, the 3 regional styles of Kalarippayattu in "
                  "accordance with the lineage on Gurukkal C.M. Sherif of the "
                  "Kerala Kalarippayat Academy in India. After a series of "
                  "dynamic warm up movements (lohars) we will introduce basic "
                  "leg swings to open the nadis, and yoga-like animal "
                  "postures. This will set participants up with a strong "
                  "foundation for learning the first body form, Kalari "
                  "Vandanam and finishing with a meditation. Expect to sweat "
                  "and move your body in new. The structure and movements in "
                  "this class strengthen your body and mind, increase "
                  "flexibility, and sharpen your focus. By encouraging a "
                  "single pointed focus (ekagrata) throughout the practice, we "
                  "can open up our awareness and the thousand eyes that subtly "
                  "exist on your body.")}

   {:id "aa84c468"
    :day :day-2
    :time "2:40 – 4:10"
    :name "Yin"
    :comment ""
    :teacher-id "aab34827"
    :room cpr
    :description (str
                  "Targets the connective tissues and darker areas where our "
                  "stresses tend to accumulate. It's a chance to literally "
                  "unravel the knots that our experiences tie inside our "
                  "bodies. Seated postures are held for several minutes, "
                  "giving them the time needed to access ligaments, tendons, "
                  "and fascia. A must for athletes and anyone with a desire to "
                  "increase their joint health and flexibility, and minimize "
                  "their potential for injury.")}

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
    :description (str
                  "In this Restore session, we will deepen awareness of the "
                  "mental, physical, and emotional places where tension "
                  "resides. we will experiment with different types of "
                  "posture and breath to discover what works to bring your "
                  "unique body into balance.")}

   {:id "20fbc1cd"
    :day :day-2
    :time "4:20 – 5:50"
    :name "Yoga and writing from the soul"
    :comment ""
    :teacher-id "d69ea7f2"
    :room studio-b
    :description (str
                  "In this class we will explore a short session of free "
                  "writing, which can help you open the creative channels and "
                  "access deeper expressions in all areas of life. We also aim "
                  "to connect and support each other as evolving souls who "
                  "happen to use writing and yoga as practice. Along with slow "
                  "movement and gentle breath work, we will tune in to our "
                  "body and listen to what our soul would like to express "
                  "through the written word.")}

   {:id "0359915e"
    :day :day-2
    :time "4:20 – 5:50"
    :name "Meditation"
    :comment ""
    :teacher-id "ccd41d5b"
    :room r119
    :description (str
                  "During the Guided Meditation practice, students will "
                  "experience a \"focusing\" process beginning with pranayama "
                  "and spinal breathing. They will be guided through some "
                  "chakra experiences leading them to their own unique "
                  "meditation experience.")}

   {:id "30b4c13a"
    :day :day-2
    :time "4:20 – 5:50"
    :name "Mandalas, Malas and Meditation"
    :comment ""
    :teacher-id "d0c76716"
    :room cpr
    :description (str
                  "Learn the purpose of a mandala and a mala in meditation "
                  "practice, and how to use them. In this hands-on, yoga "
                  "arts-and-crafts hour we will create our own unique mandala "
                  "and mala (bracelet) for our personal yoga/meditation "
                  "practice, and choose an inspiring meditation to bless/seal "
                  "our mandala and mala. Additional $5 cost for materials.")}

   {:id "b0bf0b6f"
    :day :day-2
    :time "4:20 – 5:50"
    :name "Sup Yoga"
    :comment "(Swimwear and pre-registration required)"
    :teacher-id "6f803dda"
    :room pool
    :description (str
                  "Paddle Board Yoga is a variation of stand up paddle surfing "
                  "(SUP), combined with yoga, which originated in Rishikesh, "
                  "India. The sport combines hatha yoga and vinyasa yoga "
                  "asanas, or poses, with surfing.")}
   ])


(defn get-class-by-id [id]
  (first (filter #(= (:id %) id) full-schedule)))


(defn get-class-day [day]
  (-> days day))
