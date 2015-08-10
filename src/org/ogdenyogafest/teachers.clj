(ns org.ogdenyogafest.teachers)

;;; Each teacher will have two images.  A thumbnail image of 200px x 200px,
;;; and a full size image of 450px x 450px.  Only the name of the full size
;;; image needs to be provded in the teachers list and the thumbnail image
;;; file name will be generated automatically.  The format of the image file
;;; names are first-last.jpg and first-last-thumb.jpg.


(def teachers-list
  [{:name  "Bryan Flanders"
    :image "bryan-flanders.jpg"
    :bio   "Bryan is a registered 200 HR yoga instructor. He turned to yoga
            after a cancer scare, wanting to be healthier, and found a level 
            of health never before known or expected. Bryan's three favorite 
            things about teaching include being able to facilitate healing, 
            bringing balance to one's life, and seeing his students achieve 
            their goals. Bryan enjoys staying active through wakeboarding, 
            hiking, motor cross, and has recently taken up Triathlons. Yoga 
            has enhanced these activities by giving him increased balance, 
            breathe, strength and flexibility, which he strives to pass along 
            to his students. Bryan is foremost a student of yoga and brings 
            what he learns into his class. Students can expect a playful 
            practice with fun music, education on anatomy and proper 
            alignment, class themes with takeaway thoughts and challenges, and 
            a mix of different yoga styles."}

   {:name  "Brad Carroll"
    :image "brad-carroll.jpg"
    :bio   "Has been practicing yoga for 9 years. He became a registered yoga
            teacher (200 hours) with the Yoga Alliance in 2008, and has been
            teaching yoga since then. He is co-owner of the Ogden Sangha Yoga
            studio in Marriott-Slaterville. Outside the world of yoga Brad is 
            an astrophysicist and a professor of physics at Weber State"}

   {:name  "Rachelle Krohn"
    :image "rachelle-krohn.jpg"
    :bio   "Rachelle Krohn, E RYT, was introduced to Yoga in 1997 as a teen in 
    	    Gresham Oregon. She began teaching in 2008, with certifications in 
    	    AFAA Primary Yoga, PowderBlueCo Pilates-Yoga, FiTour Advanced Yoga. 
    	    In 2011 she completed her 200 Hour Registered Yoga Teacher 
    	    certification at Infusion Yoga Studio in Bountiful Utah. She 
    	    continues to further her education. Reading, attending workshops, 
    	    master classes, and festivals. She is an active member of the yoga 
    	    community. Her consistent yoga practice continues to serve her in a 
    	    variety of ways. Healing. Empowering. Surrending. Finding clarity, 
    	    intelligence, and ultimately a deeper joy for life. She believes 
    	    that the definition and value of yoga is defined by the unique 
    	    individual. Like life, it should be free to flow and evolve. She 
    	    teaches classes focused on that personal freedom in the styles of 
    	    Vinyasa-Flow, Power, Pilates-fusion, Yin, Restorative, Therapeutic. 
    	    Rachelle also studies Thai Yoga massage, Aroma Touch Therapy with 
    	    essential oils, Chi Running, Thai Chi, Japa meditation, Kirtan, 
    	    nutrition & diabetes management (her daughter is Type 1 Diabetic). 
    	    Rachelle has successfully ran several marathons, relays (including 
    	    captaining & coaching), and enjoys trail running, singing, playing 
    	    piano, gardening, snow-boarding, paddle-boarding, advocating for 
    	    JDRF, and managing her non-profit yoga mat bag business, Yo Bagga 
    	    Bagga."}

   {:name  "Laura Thompson"
    :image "laura-thompson.jpg"
    :bio   "Laura Thompson, E-RYT - Laura has been teaching yoga for 10 years 
    		and is an Experienced Registered Yoga Teacher (E-RYT) with Yoga 
    		Alliance and believes that when we make time for Yoga, we make time 
    		for ourselves -- body, mind and spirit -- and we take needed steps 
    		toward keeping our lives in balance.  Laura approaches teaching 
    		Yoga from the point of view that we all have the capacity to do 
    		Yoga, regardless of our physical bodies.  A practice consisting of 
    		breath, any movement and thoughtful contemplation (aka meditation) 
    		leads us down a Yogic path toward better physicality and greater 
    		focus on the important things in our lives.  Laura is the owner of 
    		TimeLess Yoga Studio, where practitioners can find a zen place and 
    		13 classes per week, as well as the TimeLess Yoga Teacher Training 
    		Program."}

   {:name  "Michelle Taylor"
    :image "michelle-taylor.jpg"
    :bio   "Michelle Taylor holds a Bachelors of Science in Human Performance 
    		Management with a minor in Nutrition from Weber State University. 
    		She has been practicing yoga about 10 years and completed her 1000 
    		hr RYT January 2011 and a 200 hr RYT in March 2013. Michelle is 
    		passionate about wellness and believes that yoga will positively 
    		influence the health and wellness of everyone. She believes yoga is 
    		a very personal practice and encourages students to stay connected 
    		to their breath through out the practice. Michelle's classes focus 
    		on breath, strength, mind-body awareness, and fun"}

   {:name  "Cyndi Black"
    :image "cyndi-black.jpg"
    :bio   "Cyndi took her first yoga class in 2001 just for exercise. She 
    		then found out how it quieted her mind and got her to relax. She 
    		took her first yoga training in 2006 as a way to expand her 
    		practice. She was then hooked to spread the joy of yoga to others. 
    		She has been teaching since 2006. She completed her RYT in 2010 
    		and has taken Seniors, Pre/Post Natal, Kids, and Yoga Therapy. 
    		Cyndi loves how yoga helps her feel centered and balanced. She 
    		lives in Ogden with her husband, daughter, son, dog, and two cats. 
    		She is so excited to be a part of the Ogden Yoga Fest and can't 
    		wait for you to come and share your practice there! Namaste."}

   {:name  "Michael Larson"
    :image "michael-larson.jpg"
    :bio   "Michael Larson, Owner/Director of Bikram Yoga Ogden since 2004. 
    		Completed Vimana Beginner's Yoga and Vimana Fusion Teacher 
    		Training in 2014."}

   {:name  "Carolina Ferrin"
    :image "carolina-ferrin.jpg"
    :bio   "200 RYT Carolina has been teaching Yoga for over 5 years. She 
    		believes Yoga is available to everyone. Because of Yoga she has 
    		made new friends, gone to different places, has been introduced to 
    		many theologies and experienced personal growth. One class with 
    		Carolina will immediately show you that she is all about being 
    		real and enjoying the practice. She currently teaches at Lady 
    		Fitness, and Hill Air Force Base."}

   {:name  "Brittany Madson"
    :image "brittany-madson.jpg"
    :bio   "Brittany has found yoga to be a beautiful gift in her life and she 
    		feels blessed to have the opportunity to share her passion with 
    		other students. Integrating her formal education as a therapist 
    		and her yoga teacher training, Brittany strives to create a safe 
    		and inviting space for students to gather for a practice meant 
    		to benefit the mind, body and spirit. Brittany is also a 
    		practitioner of Phoenix Rising yoga therapy. Brittany hopes to 
    		help her students to heal, find wellness, discover mental clarity 
    		and find the truth that’s waiting for them from within."}

   {:name  "Rena Skeen"
    :image "rena-skeen.jpg"
    :bio   "Holds multiple certifications as a group fitness instructor, and 
    		completed her Registered Yoga Teacher 200 training in March. Her 
    		focus is making fitness accessible to all women regardless of 
    		experience, age, or size by creating a judgment free zone and 
    		encouraging them to unleash their personal power and beauty."}

   {:name  "Kathi Needham"
    :image "kathi-needham.jpg"
    :bio   "My practice of Yoga began in 2001 as a means to combat performance 
    		anxiety. Yoga has taught me that I can change my response to any 
    		situation simply by breathing. This realization continues to 
    		positively impact my everyday life. It has given me the courage to 
    		take on new opportunities and explore new possibilities.<br><br>
			I have found that Vinyasa Flow creates the best opportunity for me 
			to connect with and explore my body while riding a wave of 
			breath. The dance-like quality of Vinyasa allows me to find the 
			smaller movements, the postures in between the postures. Learning 
			to move through these transitions with grace offers an internal 
			strength that I use in all other areas of my life."}

   {:name  "Allison Berlin"
    :image "allison-berlin.jpg"
    :bio   "I love breathe, gardening, fun, raw chocolate, teaching, hiking, 
    		mountains, my boys, learning, kombucha, movement, smiling, oceans, 
    		sleeping, growing, loving, avocados, sitting, skiing, whistling, 
    		bird-watching, paddle boarding, taking in stray cats and trying to 
    		stand on my hands.<br><br>
			Yoga is fun for me and I try to bring that into each class I 
			teach. Also, mindfulness, breathe and play."}

   {:name  "Stephanie Detar"
    :image "stephanie-detar.jpg"
    :bio   "In her late teens Stephanie started exploring the wonderful world 
    		of yoga starting with Hatha Yoga. In 2011 she traveled to Bali, 
    		Indonesia to complete her 200 hour yoga teacher certification 
    		through The School of Sacred Arts. There she was submerged into a 
    		diverse level of teachings, Vinyasa Flow and Yin Yoga, along with 
    		delving into Ayurvedic and Tantric studies.After two months of 
    		studies and travel she returned to Texas, her home state at the 
    		time, and started teaching privately and in a classroom setting, 
    		building her experience as an instructor. At the end of 2011 she 
    		moved to Utah and continued teaching in the space that is now her 
    		studio, Lotus Yoga & Dance Studio located in downtown Ogden on 
    		Historical 25th Street. In 2012 she traveled to Venice Beach to 
    		attend Shiva Rae’s Trance Dance workshop, which merges yoga asana 
    		and free-form dance. Stephanie believes in focusing her teachings 
    		to encompass the physical, and mindfulness states creating a 
    		comfortable environment for all levels. She continues to teach 
    		Vinyasa Flow and Yin Yoga in her studio and has incorporated 
    		Trance Dance into the schedule."}

   {:name  "Chris Taylor"
    :image "chris-taylor.jpg"
    :bio   "I am a software developer, musician, martial artist and yogi. My 
    		interests include hiking, gardening reading and being outside. I 
    		love being with friends and family and simply having a good time."}

   {:name  "Kathy Stobaugh"
    :image "kathy-stobaugh.jpg"
    :bio   "Kathy Stobaugh (200hr E-RYT) has been practicing yoga since 1998. 
    		After retiring in 2009 from being an educator, she completed her 
    		yoga teacher training at Yoga Jo’s Studio in North Ogden where she 
    		began teaching in January 2010. Kathy has expanded her training by 
    		attending the Yoga Journal Conference in Estes Park, CO in 2011, 
    		2012, and 2014, concentrating on vinyasa, power yoga, alignment, 
    		and meditation practices. In January 2013, she and Brad Carroll 
    		formed a business partnership and opened their own yoga studio, 
    		Ogden Sangha Yoga located in Marriott-Slaterville on 400 North. 
    		She also teaches express classes at the BDO Gym, subs at Gold’s 
    		Gym and taught at the Eccles Art Center for several months. Kathy 
    		is passionate about sharing yoga with others. She cannot imagine a 
    		life without yoga and meditation."}

   {:name  "Charese Peterson"
    :image "charese-peterson.png"
    :bio   "Is a 26 year old ogden native, has been teaching yoga for the past 
    		year. Charese attended bikram teacher training in fall 2014, and 
    		vimana teacher training shortly after. \"My goal in life is to 
    		spread the healing energy of yoga, and to learn something new 
    		every day.\""}

   {:name  "Mike Olpin"
    :image "mike-olpin.jpg"
    :bio   "Dr. Michael Olpin is a full professor of Health Promotion at Weber 
    		State University. He has studied and researched the science of 
    		stress management for over 30 years. He received his Ph.D. in 
    		Health Education from Southern Illinois University with his 
    		dissertation focusing on the stress response in college students. 
    		He earned his M.A. in health promotion and his B.A. in 
    		organizational psychology from Brigham Young University. He has 
    		taught at several universities across the nation including West 
    		Virginia University, Virginia Tech, Concord University, Southern 
    		Illinois University, Brigham Young University, and Weber State 
    		University.<br><br>
    		
			Mike’s teaching includes many areas of health and wellness but his 
			primary focus remains on stress management, mind/body health, peak 
			performance, mental and emotional wellness, health research 
			methods, and wellness coaching.  He has presented papers and 
			spoken at many conferences, workshops, and seminars around the 
			country. In addition to these speaking engagements, he also 
			consults with sports teams and athletes, individuals, and other 
			community groups.<br><br>
			
			He is co-author of Stress Management for Life: A Research Based 
			Experiential Approach, a textbook used in colleges and 
			universities around the world. He is also the founder and Director 
			of the Stress Relief Center at Weber State University where he 
			conducts research and works with thousands of students, faculty, 
			staff, and community members in helping them reduce their stress 
			and reach peak performance. His 
			<a href='www.StressManagementPlace.com' target='_blank'>website</a>
			, focuses on stress management and wellness education. He has 
			produced video, CD’s, DVDs, MP3’s, and other media featuring 
			stress reduction and relaxation training. He has also written the 
			stress management book entitled The World is Not a Stressful 
			Place.<br><br>
			
			His latest book, titled, “Unwind: 7 paradigms of a stress-free 
			life”, written with Sam Bracken and the FranklinCovey Company 
			launched in August 2014.<br><br>
			
			Mike enjoys athletics and participates in a variety of sports. He 
			enjoys spending time with his wife, Shanyn and their four 
			children, Analise, Erica, Adam, and Benjamin. He loves playing 
			with his kids, and coaching them in various sports. In his free 
			time you will find him biking and trail running in the beautiful 
			mountains of northern Utah, where they currently reside.<br><br>
			
			Mike learned how to meditate in 1988 and has been actively 
			practicing and teaching meditation ever since."}

   {:name  "Lehi Vitor"
    :image "lehi-vitor.jpg"
    :bio   "Lehi vitor ( Pezão ) was born in Goiania, Brazil, Started training 
    		capoeira in 2004 under Mestre Efraim in Silva where he found a 
    		passion for capoeira at a young age. Today Pezão has over 10 years 
    		of experience in capoeira and is under the tutelage of Mestre 
    		Jamiaka, where he hopes to share capoeira as a art-form and 
    		culture with everyone."}

   {:name  "Reina Forsythe"
    :image "reina-forsythe.jpg"
    :bio   "Reina began a consistent yoga practice after a college yoga course 
    		18 years ago. After 11 years of practice Reina certified as an 
    		instructor through InBody Yoga Academy, D’ana Baptiste’s 500 hr 
    		Certification Program and has been teaching ever since. Reina is 
    		registered with Yoga Alliance as an E-RYT which necessitates over 
    		2000 hours of teaching experience. Reina has taught at numerous 
    		studios as well as corporate and private settings. Reina is also 
    		registered with the International Association of Yoga Therapists 
    		and has further trained and certified in the areas of pre and 
    		postnatal yoga, yoga for trauma, biomechanics, alignment, 
    		restorative yoga, and meditation. Reina has studied with senior 
    		teachers such as Donna Farhi, Richard Miller, Charlotte Bell, 
    		Susan McLaughlin, Bryan Kest, Thich Nhat Hanh, Baron Baptiste, 
    		Matthew Cohen and in Kerala, India with Peter Francyk. In addition 
    		to the knowledge of the body received through yoga training, Reina 
    		worked for the fire department for five years during which she 
    		certified as an EMT, BLS , CPR, and First Aid Instructor."}

   {:name  "Rachel Ellis"
    :image "rachel-ellis.jpg"
    :bio   "Is the lively spirit behind On the Pond Fitness & Rentals. Her 
    		introduction to SUP came in Hawaii in 2010 while vacationing with 
    		friends. Once was all it took for Rachel to know that SUP was 
    		coming to Utah because she would find a way to bring it here and 
    		share it. The only thing better than having something you're 
    		passionate about is having someone to share it with and that’s 
    		when On the Pond Fitness & Rentals was born.<br><br>
    		
			Since that time Rachel has been certified to teach stand up paddle 
			boarding (SUP) and SUP Yoga from the incredible Gillian Gibree of 
			Paddle Into Fitness from San Diego, California. She is a yoga 
			teacher certified through Infusion Yoga & Pilates, run by the 
			fantastic Corena Hammer from Bountiful, Utah. Rachel is also a Pro 
			Team Athlete for Dave Scadden Paddle Boards."}

   {:name  "Kimberly Achelis-Hoggan"
    :image "kimberly-achelis-hoggan.jpg"
    :bio   "Kimberly Achelis-Hoggan has been teaching yoga for 10 years and is 
    		proud to be a Certified Anusara Yoga Teacher E-RYT and Licensed 
    		Massage Therapist. She has studied thousands of hours from 
    		inspiring teachers including Certified Anusara Teachers Adam 
    		Ballenger, Tiffany Wood and Benita Galvan. Anusara Yoga has helped 
    		her heal her injured body, overcome addiction, and learn how to 
    		look for the good. Kim uses her knowledge of anatomy, kinesiology, 
    		biomechanics, and The Universal Principles of Alignment&trade; to 
    		help students find a therapeutic experience in every posture. This 
    		highly effective style of hatha yoga is rooted in alignment of the 
    		body. When the body is brought into a place of healing, ease and 
    		celebration the heart and mind follow."}
    
   {:name  "Joe Perry"
    :image "joe-perry.jpg"
    :bio   "Joe Perry aka (Jai Krishna Das) has been practicing yoga for over 
    		10 years and teaching for the last 4 years. He teaches at Gold’s 
    		Gym, 3B Yoga, and is part of the amazing Sunday Funday free 
    		yoga/slacklining class in Orem. Jai has traveled and studied yoga 
    		and kirtan in India twice. He loves to perform kirtan (yoga music 
    		and chanting) and leads kirtans regularly at the Krishna Temple, 
    		as well as live music classes at various yoga studios.<br><br>
    		
			Glowga Yoga After Dark: This class is a fun all-level yoga class 
			under black lights! We have some glow in the dark body paint 
			available, and feel free to bring your own. Be sure to arrive a 
			few minutes early for a body paint party! White and lighter 
			colored yoga clothes and glow bracelets work well under the black 
			lights. We are very excited to announce that the music for this 
			class will be provided by our very own live DJ, Jason Keifer 
			(DJ Nourish). His amazing beats along with the glowing yoga will 
			leave you in a good mood for days!Photo credit: Eric R Ward 
			PhotographyPhoto credit: Eric R Ward Photography"}
    
   {:name  "Pati Reiss"
    :image "pati-reiss.png"
    :bio   "Pati Reiss, BA, HHC, NRC is a certified holistic health 
    		coach/nutrition recovery coach, educator and chef. Her work 
    		focuses on teaching and coaching healthy lifestyle upgrades,
			addiction/mental health recovery and holistic gourmet cooking. 
			This is done using nutrition, food, amino acid therapy, meditation 
			and movement. Through her own healing recovery Pati has found that 
			vibrant health, hope and recovery are possible and advocates this 
			in all her teachings. She is a graduate of the Institute for 
			Integrative Nutrition, NYC New York 2000, and holds and Bachelor 
			of Arts in Human Services & Special Education from Trinity 
			College, Vermont 1978. She has completed, The Neuro-Nutrient 
			Therapy for Addictive Disorders Training with Julia Ross in June 
			of 2008 and her certification training as a Recovery Nutrition 
			Coach through The Alliance for Addiction Solutions & Christina 
			Veselak in 2014. She has been a board member of The Alliance for 
			Addiction Solutions promoting nutrition & integrative therapies 
			for transforming the addictive brain, since 2010 and is currently 
			the president of the board of directors. She currently has a 
			private Holistic Health & Recovery Coaching practice in Salt Lake 
			City, Utah and also works long distance with clients throughout 
			the country. She is currently and has been teaching nutrition, 
			meditation and movement for recovery at a residential treatment 
			program and in the community in Salt Lake City. She also does 
			holistic recovery trainings throughout the country. Pati is also 
			founder of, High Vibe Recovery a holistic recovery coaching 
			program and The Holistic Gourmet which offers cooking classes, 
			food and nutrition education classes."}
])
