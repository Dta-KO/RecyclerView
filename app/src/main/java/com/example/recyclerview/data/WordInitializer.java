package com.example.recyclerview.data;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class WordInitializer implements DataInitializable {

    @Override
    public void runInitialization(Context context) {
        List<Word> words = new ArrayList<>();
        initializeAnimals(words);
        initializeFamily(words);
        initializeClothes(words);
        initializeColors(words);
        initializeFruits(words);
        initializeCooking(words);
        initializeMusic(words);
        initializeNumbers(words);
        initializeSchool(words);
        initializeSport(words);
        initializeTraffic(words);
        initializeVegetable(words);
        initializeWeather(words);
        initializeHospital(words);
        initializeRestaurant(words);
        initializeAdjective(words);
        initializeAction(words);
        initializeClass1(words);
        initializeClass2(words);
        initializeClass3(words);
        initializeClass4(words);
        initializeClass5(words);
        initializeClass6(words);
        initializeClass7(words);
        initializeClass8(words);
        initializeClass9(words);
        initializePositions(words);
        initializeDepartments(words);
        initializeSupply(words);
        initializeBenefit(words);
        initializeConferences(words);
        initializeStructure(words);
        initializeJobs(words);
        initializeEquipments(words);
        initializeHotels(words);
        initializeSea(words);
        initializePlane(words);
        initializeOverview(words);
        initializeContracts(words);
        initializeShopping(words);
        initializeMarketing(words);


        DatabaseHelper db = new DatabaseHelper(context);
        WordDAO wordDAO = new WordDAO(db);
        wordDAO.addWord(words);
    }
    //BASIC ENGLISH
    private static void initializeAnimals(List<Word> words) {
        words.add(new Word(TopicDAO.ANIMAL, "Cat", "Con Mèo", "My cat has very beautiful eyes"));
        words.add(new Word(TopicDAO.ANIMAL, "Dog", "Con Chó", "Dogs are very loyal animals"));
        words.add(new Word(TopicDAO.ANIMAL, "Pig", "Con Lợn", "Pigs are very lazy animals"));
        words.add(new Word(TopicDAO.ANIMAL, "Duck", "Con vịt", "Ducks can lay a maximum of 250 eggs per year"));
        words.add(new Word(TopicDAO.ANIMAL, "Ant", "Con Kiến", "The ants are really hardworking"));
        words.add(new Word(TopicDAO.ANIMAL, "Cow", "Con bò", "The cow has 2 very sharp horns"));
        words.add(new Word(TopicDAO.ANIMAL, "Fish", "Con cá", "Fish meat provides a lot of protein"));
        words.add(new Word(TopicDAO.ANIMAL, "Monkey", "Con khỉ", "Monkeys are very intelligent animals"));
        words.add(new Word(TopicDAO.ANIMAL, "Rabbit", "Con thỏ", "Rabbits have very long ears"));
        words.add(new Word(TopicDAO.ANIMAL, "Ostrich", "Con đà điểu", "Ostrich is the fastest bird"));
        words.add(new Word(TopicDAO.ANIMAL, "Elephant", "Con voi", "Elephants have a very large body"));
        words.add(new Word(TopicDAO.ANIMAL, "Bid", "Con chim", "Birds can fly very fast"));
        words.add(new Word(TopicDAO.ANIMAL, "Turtle", "Con rùa", "Turtles crawl very slowly"));
        words.add(new Word(TopicDAO.ANIMAL, "Snake", "Con rắn", "Snakes are animals without legs"));
        words.add(new Word(TopicDAO.ANIMAL, "Lion", "Con sư tử", "Lion is very good at hunting"));
        words.add(new Word(TopicDAO.ANIMAL, "Rooster", "Con gà trống"));
        words.add(new Word(TopicDAO.ANIMAL, "Mouse", "Con chuột"));
        words.add(new Word(TopicDAO.ANIMAL, "Cow", "Con bò sữa"));
        words.add(new Word(TopicDAO.ANIMAL, "Bear", "Con gấu"));
        words.add(new Word(TopicDAO.ANIMAL, "Horse", "Con ngựa"));
        words.add(new Word(TopicDAO.ANIMAL, "Butterfly", "Con bướm"));
        words.add(new Word(TopicDAO.ANIMAL, "Panda", "Con gấu trúc"));
        words.add(new Word(TopicDAO.ANIMAL, "Penguin", "Con chim cánh cụt"));
        words.add(new Word(TopicDAO.ANIMAL, "Kangaroo", "Con chuột túi"));
        words.add(new Word(TopicDAO.ANIMAL, "Tiger", "Con hổ"));
        words.add(new Word(TopicDAO.ANIMAL, "Owl", "Con cú mèo"));
        words.add(new Word(TopicDAO.ANIMAL, "Peacock", "Con công"));
        words.add(new Word(TopicDAO.ANIMAL, "Swan", "Con thiên nga"));
        words.add(new Word(TopicDAO.ANIMAL, "Pelican", "Con bồ nông"));
        words.add(new Word(TopicDAO.ANIMAL, "Cheetah", "Con báo"));
        words.add(new Word(TopicDAO.ANIMAL, "Deer", "Con hươu"));
        words.add(new Word(TopicDAO.ANIMAL, "Giraffe", "Con hươu cao cổ"));
        words.add(new Word(TopicDAO.ANIMAL, "Hippopotamus", "Con hà mã"));
        words.add(new Word(TopicDAO.ANIMAL, "Zebra", "Con ngựa vằn"));
        words.add(new Word(TopicDAO.ANIMAL, "Rhinoceros", "Con tê giác"));
        words.add(new Word(TopicDAO.ANIMAL, "Sheep", "Con cừu"));
        words.add(new Word(TopicDAO.ANIMAL, "Squirrel", "Con sóc"));
        words.add(new Word(TopicDAO.ANIMAL, "Stag", "Con nai"));
        words.add(new Word(TopicDAO.ANIMAL, "Frog", "Con ếch"));
        words.add(new Word(TopicDAO.ANIMAL, "Toad", "Con cóc"));
        words.add(new Word(TopicDAO.ANIMAL, "Shark", "Con cá mập"));
        words.add(new Word(TopicDAO.ANIMAL, "Starfish", "Con sao biển"));
        words.add(new Word(TopicDAO.ANIMAL, "Seal", "Con hải cẩu"));
        words.add(new Word(TopicDAO.ANIMAL, "Walrus", "Con hà mã"));
        words.add(new Word(TopicDAO.ANIMAL, "Whale", "Con cá voi"));
        words.add(new Word(TopicDAO.ANIMAL, "Crocodile", "Con cá sấu"));
        words.add(new Word(TopicDAO.ANIMAL, "Dolphin", "Con cá heo"));
        words.add(new Word(TopicDAO.ANIMAL, "Eagle", "Con đại bàng"));
        words.add(new Word(TopicDAO.ANIMAL, "Pigeon", "Con chim bồ câu"));
        words.add(new Word(TopicDAO.ANIMAL, "Fly", "Con ruồi"));
        words.add(new Word(TopicDAO.ANIMAL, "Mosquito", "Con muỗi"));
        words.add(new Word(TopicDAO.ANIMAL, "Stork", "Con cò"));
        words.add(new Word(TopicDAO.ANIMAL, "Cuttle", "Con mực"));
        words.add(new Word(TopicDAO.ANIMAL, "Crab", "Con cua"));
        words.add(new Word(TopicDAO.ANIMAL, "Fox", "Con cáo"));
        words.add(new Word(TopicDAO.ANIMAL, "Weasel", "Con chồn"));
        words.add(new Word(TopicDAO.ANIMAL, "Chimpanzee", "Con tinh tinh"));
        words.add(new Word(TopicDAO.ANIMAL, "Goat", "Con dê"));
        words.add(new Word(TopicDAO.ANIMAL, "Dragon", "Con rồng"));
        words.add(new Word(TopicDAO.ANIMAL, "Dinosaur", "Con khủng long"));
        words.add(new Word(TopicDAO.ANIMAL, "Cicada", "Con ve"));
        words.add(new Word(TopicDAO.ANIMAL, "Mantis", "Con bọ ngựa"));
        words.add(new Word(TopicDAO.ANIMAL, "Grasshopper", "Con châu chấu"));
        words.add(new Word(TopicDAO.ANIMAL, "Buffalo", "Con trâu"));
        words.add(new Word(TopicDAO.ANIMAL, "Parrot", "Con vẹt"));
        words.add(new Word(TopicDAO.ANIMAL, "Blackbird", "Con sáo"));
        words.add(new Word(TopicDAO.ANIMAL, "Hedgehog", "Con nhím"));
        words.add(new Word(TopicDAO.ANIMAL, "Snail", "Con sên"));
        words.add(new Word(TopicDAO.ANIMAL, "Bee", "Con ong"));
        words.add(new Word(TopicDAO.ANIMAL, "Ladybug", "Con bọ rùa"));
        words.add(new Word(TopicDAO.ANIMAL, "Worm", "Con sâu"));
        words.add(new Word(TopicDAO.ANIMAL, "Goose", "Con ngỗng"));
        words.add(new Word(TopicDAO.ANIMAL, "Koala", "Con gấu túi"));
    }

    private static void initializeFamily(List<Word> words) {
        words.add(new Word(TopicDAO.FAMILY, "Mother", "Mẹ"));
        words.add(new Word(TopicDAO.FAMILY, "Father", "Bố"));
        words.add(new Word(TopicDAO.FAMILY, "Younger sister", "Em gái"));
        words.add(new Word(TopicDAO.FAMILY, "Younger brother", "Em trai"));
        words.add(new Word(TopicDAO.FAMILY, "Sister", "Chị gái"));
        words.add(new Word(TopicDAO.FAMILY, "Brother", "Anh trai"));
        words.add(new Word(TopicDAO.FAMILY, "Aunt", "Cô, thím"));
        words.add(new Word(TopicDAO.FAMILY, "Uncle", "Chú, bác"));
        words.add(new Word(TopicDAO.FAMILY, "Stepfather", "Cha dượng"));
        words.add(new Word(TopicDAO.FAMILY, "Stepmother", "Mẹ kế"));
        words.add(new Word(TopicDAO.FAMILY, "Son", "Con trai"));
        words.add(new Word(TopicDAO.FAMILY, "Relative", "Họ hàng"));
        words.add(new Word(TopicDAO.FAMILY, "Parents", "Bố mẹ"));
        words.add(new Word(TopicDAO.FAMILY, "Niece", "Cháu gái"));
        words.add(new Word(TopicDAO.FAMILY, "Nephew", "Cháu trai"));
        words.add(new Word(TopicDAO.FAMILY, "Husband", "Chồng"));
        words.add(new Word(TopicDAO.FAMILY, "Grandson", "Cháu trai"));
        words.add(new Word(TopicDAO.FAMILY, "Wife", "Vợ"));
        words.add(new Word(TopicDAO.FAMILY, "Grandparent", "Ông bà"));
        words.add(new Word(TopicDAO.FAMILY, "Grandmother",   "Bà"));
        words.add(new Word(TopicDAO.FAMILY, "Grandfather", "Ông"));
        words.add(new Word(TopicDAO.FAMILY, "Grandchild", "Cháu"));
        words.add(new Word(TopicDAO.FAMILY, "Family", "Gia đình"));
        words.add(new Word(TopicDAO.FAMILY, "Daughter", "Con gái"));
        words.add(new Word(TopicDAO.FAMILY, "Cousin", "Anh/em con chú/bác"));
        words.add(new Word(TopicDAO.FAMILY, "Ex-husband", "Chồng cũ"));
        words.add(new Word(TopicDAO.FAMILY, "Ex-wife", "Vợ cũ"));
        words.add(new Word(TopicDAO.FAMILY, "Half-brother", "Anh em cùng cha khác mẹ"));
        words.add(new Word(TopicDAO.FAMILY, "Half-sister", "Chị em cùng cha khác mẹ"));
        words.add(new Word(TopicDAO.FAMILY, "Father-in-law", "Bố chồng"));
        words.add(new Word(TopicDAO.FAMILY, "Mother in-law", "Mẹ chồng"));
        words.add(new Word(TopicDAO.FAMILY, "Finacee", "Vị hun thê"));
        words.add(new Word(TopicDAO.FAMILY, "Heir", "Người thừa kế"));
        words.add(new Word(TopicDAO.FAMILY, "First-born child", "Con đầu lòng"));
        words.add(new Word(TopicDAO.FAMILY, "Flesh and blood", "Ruột thịt"));
        words.add(new Word(TopicDAO.FAMILY, "Descendant", "Hậu duệ"));
        words.add(new Word(TopicDAO.FAMILY, "Extended family", "Đại gia đình"));
        words.add(new Word(TopicDAO.FAMILY, "Offspring", "Con cháu"));
        words.add(new Word(TopicDAO.FAMILY, "Twins", "Sinh đôi"));
    }

    private static void initializeClothes(List<Word> words) {
        words.add(new Word(TopicDAO.CLOTHES, "Shirt", "Áo sơ mi"));
        words.add(new Word(TopicDAO.CLOTHES, "T-shirt", "Áo phông"));
        words.add(new Word(TopicDAO.CLOTHES, "Dress", "Váy liền"));
        words.add(new Word(TopicDAO.CLOTHES, "Skirt", "Chân váy"));
        words.add(new Word(TopicDAO.CLOTHES, "Jeans", "Quần bò"));
        words.add(new Word(TopicDAO.CLOTHES, "Shorts", "Quần soóc"));
        words.add(new Word(TopicDAO.CLOTHES, "Jacket", "Áo khoác"));
        words.add(new Word(TopicDAO.CLOTHES, "Tie", "Cà vạt"));
        words.add(new Word(TopicDAO.CLOTHES, "Hat", "Mũ"));
        words.add(new Word(TopicDAO.CLOTHES, "Gloves", "Găng tay"));
        words.add(new Word(TopicDAO.CLOTHES, "Coat", "Áo"));
        words.add(new Word(TopicDAO.CLOTHES, "Shoe", "Đôi giày"));
        words.add(new Word(TopicDAO.CLOTHES, "Ring", "Cái nhẫn"));
        words.add(new Word(TopicDAO.CLOTHES, "Glasses", "Kính mắt"));
        words.add(new Word(TopicDAO.CLOTHES, "Pants", "Quần tây dài"));
        words.add(new Word(TopicDAO.CLOTHES, "Crown", "Vương miện"));
        words.add(new Word(TopicDAO.CLOTHES, "Swimsuit", "Áo tắm"));
        words.add(new Word(TopicDAO.CLOTHES, "Bow", "Cái nơ"));
        words.add(new Word(TopicDAO.CLOTHES, "Necktie", "Cà vạt"));
        words.add(new Word(TopicDAO.CLOTHES, "Cane", "Gật ba-toong"));
        words.add(new Word(TopicDAO.CLOTHES, "Umbrella", "Cái ô"));
        words.add(new Word(TopicDAO.CLOTHES, "Wallet", "Cái ví"));
        words.add(new Word(TopicDAO.CLOTHES, "Toque", "Mũ len"));
        words.add(new Word(TopicDAO.CLOTHES, "Suitcase", "Va li"));
        words.add(new Word(TopicDAO.CLOTHES, "Bathrobe", "Áo choàng tắm"));
        words.add(new Word(TopicDAO.CLOTHES, "Cap", "Mũ lưỡi trai"));
        words.add(new Word(TopicDAO.CLOTHES, "Sunglasses", "Kính râm"));
        words.add(new Word(TopicDAO.CLOTHES, "Backpack", "Ba lô"));
        words.add(new Word(TopicDAO.CLOTHES, "Briefcase", "Cái cặp sách"));
        words.add(new Word(TopicDAO.CLOTHES, "Sneakers", "Giầy thể thao"));
        words.add(new Word(TopicDAO.CLOTHES, "Purse", "Túi xách tay"));
        words.add(new Word(TopicDAO.CLOTHES, "Zipper", "Khóa kéo"));
        words.add(new Word(TopicDAO.CLOTHES, "Safety pin", "Ghim băng"));
        words.add(new Word(TopicDAO.CLOTHES, "Hanger", "Mắc áo"));
        words.add(new Word(TopicDAO.CLOTHES, "Jewelry", "Đồ trang sức"));
        words.add(new Word(TopicDAO.CLOTHES, "Pajamas", "Bộ đồ ngủ"));
        words.add(new Word(TopicDAO.CLOTHES, "Raincoat", "Áo mưa"));
        words.add(new Word(TopicDAO.CLOTHES, "Raincoat", "Áo mưa"));
        words.add(new Word(TopicDAO.CLOTHES, "Backpack", "Ba lô"));
        words.add(new Word(TopicDAO.CLOTHES, "Slippers", "Dép lê"));
        words.add(new Word(TopicDAO.CLOTHES, "Sweater", "Áo len"));
        words.add(new Word(TopicDAO.CLOTHES, "Trousers", "Quần"));
        words.add(new Word(TopicDAO.CLOTHES, "Underwear", "Quần áo lót"));
        words.add(new Word(TopicDAO.CLOTHES, "Goggles", "Kính bơi"));
        words.add(new Word(TopicDAO.CLOTHES, "Wedding dress", "Váy cưới"));
    }

    private static void initializeColors(List<Word> words) {
        words.add(new Word(TopicDAO.COLOR, "Blu", "Màu xanh da trời"));
        words.add(new Word(TopicDAO.COLOR, "Green", "Màu xanh lá cây"));
        words.add(new Word(TopicDAO.COLOR, "Yellow", "Màu vàng"));
        words.add(new Word(TopicDAO.COLOR, "Red", "Màu đỏ"));
        words.add(new Word(TopicDAO.COLOR, "Pink", "Màu hồng"));
        words.add(new Word(TopicDAO.COLOR, "Black", "Màu đen"));
        words.add(new Word(TopicDAO.COLOR, "Gray", "Màu xám"));
        words.add(new Word(TopicDAO.COLOR, "Orange", "Màu cam"));
        words.add(new Word(TopicDAO.COLOR, "Brown", "Màu nâu"));
        words.add(new Word(TopicDAO.COLOR, "White", "Màu trắng"));
        words.add(new Word(TopicDAO.COLOR, "Sliver", "Màu bạc"));
        words.add(new Word(TopicDAO.COLOR, "Cream", "Màu kem"));
        words.add(new Word(TopicDAO.COLOR, "Navy blue", "Màu xanh nước biển"));
        words.add(new Word(TopicDAO.COLOR, "Purple", "Màu tím"));
        words.add(new Word(TopicDAO.COLOR, "Turquoise", "Màu ngọc lam"));
    }

    private static void initializeFruits(List<Word> words) {
        words.add(new Word(TopicDAO.FRUIT, "Apple", "Quả táo"));
        words.add(new Word(TopicDAO.FRUIT, "Banana", "Quả chuối"));
        words.add(new Word(TopicDAO.FRUIT, "Orange", "Quả cam"));
        words.add(new Word(TopicDAO.FRUIT, "Lemon", "Quả chanh"));
        words.add(new Word(TopicDAO.FRUIT, "Peach", "Quả đào"));
        words.add(new Word(TopicDAO.FRUIT, "Pear", "Quả lê"));
        words.add(new Word(TopicDAO.FRUIT, "Berry", "Quả dâu"));
        words.add(new Word(TopicDAO.FRUIT, "Watermelon ", "Quả dưa hấu"));
        words.add(new Word(TopicDAO.FRUIT, "Pineapple", "Quả dứa"));
        words.add(new Word(TopicDAO.FRUIT, "Tomato", "Cà chua"));
        words.add(new Word(TopicDAO.FRUIT, "Potato", "Khoai tây"));
        words.add(new Word(TopicDAO.FRUIT, "Celery", "Cần tây"));
        words.add(new Word(TopicDAO.FRUIT, "Beet", "Củ cải đường"));
        words.add(new Word(TopicDAO.FRUIT, "Carrot", "Củ cà rốt"));
        words.add(new Word(TopicDAO.FRUIT, "Peas", "Đậu hà lan"));
        words.add(new Word(TopicDAO.FRUIT, "Corn", "Bắp ngô"));
        words.add(new Word(TopicDAO.FRUIT, "Leek", "Tỏi tây"));
        words.add(new Word(TopicDAO.FRUIT, "Garlic", "Củ tỏi"));
        words.add(new Word(TopicDAO.FRUIT, "Pickle", "Dưa chuột bao tử"));
        words.add(new Word(TopicDAO.FRUIT, "Cauliflower", "Súp lơ"));
        words.add(new Word(TopicDAO.FRUIT, "Chinese cabbage", "Cải thảo"));
        words.add(new Word(TopicDAO.FRUIT, "Squash", "Quả bí"));
        words.add(new Word(TopicDAO.FRUIT, "Cucumber", "Dưa chuột"));
        words.add(new Word(TopicDAO.FRUIT, "Eggplant", "Cà tím"));
        words.add(new Word(TopicDAO.FRUIT, "Chilli", "Quả ớt"));
        words.add(new Word(TopicDAO.FRUIT, "Avocado", "Quả bơ"));
        words.add(new Word(TopicDAO.FRUIT, "Lettuce", "Rau diếp"));
        words.add(new Word(TopicDAO.FRUIT, "Mushroom", "Nấm"));
        words.add(new Word(TopicDAO.FRUIT, "Red pepper", "Ớt ngọt"));
        words.add(new Word(TopicDAO.FRUIT, "Artichoke", "Cây atisô"));
        words.add(new Word(TopicDAO.FRUIT, "Peas", "Đậu hà lan"));
        words.add(new Word(TopicDAO.FRUIT, "Thai eggplant", "Cà pháo"));
    }

    private static void initializeCooking(List<Word> words) {
        words.add(new Word(TopicDAO.COOKING, "Cup", "Cái chén"));
        words.add(new Word(TopicDAO.COOKING, "Plate", "Cái đĩa"));
        words.add(new Word(TopicDAO.COOKING, "Fork", "Cái nĩa"));
        words.add(new Word(TopicDAO.COOKING, "Spoon", "Cái thìa"));
        words.add(new Word(TopicDAO.COOKING, "Ladle", "Cái môi múc canh"));
        words.add(new Word(TopicDAO.COOKING, "Pot", "Cái nồi"));
        words.add(new Word(TopicDAO.COOKING, "Coffee pot", "Bình pha cà phê"));
        words.add(new Word(TopicDAO.COOKING, "Teapot", "Cái ấm"));
        words.add(new Word(TopicDAO.COOKING, "Wine glass", "Cái ly"));
        words.add(new Word(TopicDAO.COOKING, "Chopsticks", "Đôi đũa"));
        words.add(new Word(TopicDAO.COOKING, "Mixer", "Máy trộn thức ăn"));
        words.add(new Word(TopicDAO.COOKING, "Blender", "Máy xay sinh tố"));
        words.add(new Word(TopicDAO.COOKING, "Pitcher", "Bình nước"));
        words.add(new Word(TopicDAO.COOKING, "Kettle", "Ấm nước"));
        words.add(new Word(TopicDAO.COOKING, "Knife", "Con dao"));
        words.add(new Word(TopicDAO.COOKING, "Broom", "Cái chổi"));
        words.add(new Word(TopicDAO.COOKING, "Refrigerator", "Tủ lạnh"));
        words.add(new Word(TopicDAO.COOKING, "Can opener", "Đồ khui hộp"));
        words.add(new Word(TopicDAO.COOKING, "Corkscrew", "Đồ mở nút chai"));
        words.add(new Word(TopicDAO.COOKING, "Egg-whisk", "Đồ đánh trứng"));
        words.add(new Word(TopicDAO.COOKING, "Funnel", "Phễu"));
        words.add(new Word(TopicDAO.COOKING, "Frying pan", "Cái chảo"));
        words.add(new Word(TopicDAO.COOKING, "Cucumber", "Dưa chuột"));
        words.add(new Word(TopicDAO.COOKING, "Dishwasher", "Máy rửa bát"));
        words.add(new Word(TopicDAO.COOKING, "Microwave", "Lò vi sóng"));
        words.add(new Word(TopicDAO.COOKING, "Washing machine", "Máy giặt"));
        words.add(new Word(TopicDAO.COOKING, "Muffin tin", "Khay làm bánh nướng"));
        words.add(new Word(TopicDAO.COOKING, "Oven mitt", "Bao lót tay"));
        words.add(new Word(TopicDAO.COOKING, "Rolling pin", "Cán nhào lộn"));
        words.add(new Word(TopicDAO.COOKING, "Dustpan", "Cái hót rác"));
        words.add(new Word(TopicDAO.COOKING, "Gas stove", "Bếp ga"));
        words.add(new Word(TopicDAO.COOKING, "Colander", "Cái rổ"));
    }

    private static void initializeMusic(List<Word> words) {
        words.add(new Word(TopicDAO.MUSIC, "Guitar", "Đàn ghi-ta"));
        words.add(new Word(TopicDAO.MUSIC, "Flute", "Ống sáo"));
        words.add(new Word(TopicDAO.MUSIC, "Piano", "Đàn piano"));
        words.add(new Word(TopicDAO.MUSIC, "Violin", "Đàn vi-ô-lông"));
        words.add(new Word(TopicDAO.MUSIC, "Drum", "Cái trống"));
        words.add(new Word(TopicDAO.MUSIC, "Lyre", "Đàn lia"));
        words.add(new Word(TopicDAO.MUSIC, "Harp", "Đàn hạc"));
        words.add(new Word(TopicDAO.MUSIC, "Drum kit", "Bộ trống"));
        words.add(new Word(TopicDAO.MUSIC, "Lute", "Đàn tỳ bà"));
        words.add(new Word(TopicDAO.MUSIC, "Accordion", "Đàn Ắc-coóc-đê-ông"));
        words.add(new Word(TopicDAO.MUSIC, "Bagpipes", "Kèn túi"));
        words.add(new Word(TopicDAO.MUSIC, "Banjo", "Đàn pan-jô"));
        words.add(new Word(TopicDAO.MUSIC, "Bongos", "Trống gõ bằng tay"));
        words.add(new Word(TopicDAO.MUSIC, "Cello", "Đàn vi-ô-lông-xen"));
        words.add(new Word(TopicDAO.MUSIC, "Chimes", "Chuông hòa âm"));
        words.add(new Word(TopicDAO.MUSIC, "Clarinet", "Kèn clarinet"));
        words.add(new Word(TopicDAO.MUSIC, "Cymbals", "Cái chũm chọe"));
        words.add(new Word(TopicDAO.MUSIC, "Electric guitar", "Đàn ghi-ta điện"));
        words.add(new Word(TopicDAO.MUSIC, "French horn", "Kèn coóc"));
        words.add(new Word(TopicDAO.MUSIC, "Harmonica", "Kèn ac-mô-ni-ca"));
        words.add(new Word(TopicDAO.MUSIC, "Mandolin", "Đàn măng-đô-lin"));
        words.add(new Word(TopicDAO.MUSIC, "Metronome", "Máy đánh nhịp"));
        words.add(new Word(TopicDAO.MUSIC, "Oboe", "Kèn ô-boa"));
        words.add(new Word(TopicDAO.MUSIC, "Pan pipes", "Sáo bè"));
        words.add(new Word(TopicDAO.MUSIC, "Recorder", "Ống tiêu"));
        words.add(new Word(TopicDAO.MUSIC, "Saxophone", "Kèn xắc-xô-phôn"));
        words.add(new Word(TopicDAO.MUSIC, "Triangle", "Đàn tam giác"));
        words.add(new Word(TopicDAO.MUSIC, "Trumpet", "Kèn trom-pet"));
        words.add(new Word(TopicDAO.MUSIC, "Xylophone", "Đàn phiến gỗ"));
    }

    private static void initializeNumbers(List<Word> words) {
        words.add(new Word(TopicDAO.NUMBER, "Zero", "Số 0"));
        words.add(new Word(TopicDAO.NUMBER, "One", "Số 1"));
        words.add(new Word(TopicDAO.NUMBER, "Two", "Số 2"));
        words.add(new Word(TopicDAO.NUMBER, "Three", "Số 3"));
        words.add(new Word(TopicDAO.NUMBER, "Four", "Số 4"));
        words.add(new Word(TopicDAO.NUMBER, "Five", "Số 5"));
        words.add(new Word(TopicDAO.NUMBER, "Six", "Số 6"));
        words.add(new Word(TopicDAO.NUMBER, "Seven", "Số 7"));
        words.add(new Word(TopicDAO.NUMBER, "Eight", "Số 8"));
        words.add(new Word(TopicDAO.NUMBER, "Nine", "Số 9"));
        words.add(new Word(TopicDAO.NUMBER, "Ten", "Số 10"));
        words.add(new Word(TopicDAO.NUMBER, "Eleven", "Số 11"));
        words.add(new Word(TopicDAO.NUMBER, "Twelve", "Số 12"));
        words.add(new Word(TopicDAO.NUMBER, "Thirteen", "Số 13"));
        words.add(new Word(TopicDAO.NUMBER, "Fourteen", "Số 14"));
        words.add(new Word(TopicDAO.NUMBER, "Fifteen", "Số 15"));
        words.add(new Word(TopicDAO.NUMBER, "Sixteen", "Số 16"));
        words.add(new Word(TopicDAO.NUMBER, "Seventeen", "Số 17"));
        words.add(new Word(TopicDAO.NUMBER, "Eighteen", "Số 18"));
        words.add(new Word(TopicDAO.NUMBER, "Nineteen", "Số 19"));
        words.add(new Word(TopicDAO.NUMBER, "Twenty", "Số 20"));
        words.add(new Word(TopicDAO.NUMBER, "Twenty-one", "Số 21"));
        words.add(new Word(TopicDAO.NUMBER, "Twenty-two", "Số 22"));
        words.add(new Word(TopicDAO.NUMBER, "Twenty-three", "Số 23"));
        words.add(new Word(TopicDAO.NUMBER, "Twenty-four", "Số 24"));
        words.add(new Word(TopicDAO.NUMBER, "Twenty-five", "Số 25"));
        words.add(new Word(TopicDAO.NUMBER, "Twenty-six", "Số 26"));
        words.add(new Word(TopicDAO.NUMBER, "Twenty-seven", "Số 27"));
        words.add(new Word(TopicDAO.NUMBER, "Twenty-eight", "Số 28"));
        words.add(new Word(TopicDAO.NUMBER, "Twenty-nine", "Số 29"));
        words.add(new Word(TopicDAO.NUMBER, "Thirty", "Số 30"));
        words.add(new Word(TopicDAO.NUMBER, "Thirty-one", "Số 31"));
        words.add(new Word(TopicDAO.NUMBER, "Thirty-two", "Số 32"));
        words.add(new Word(TopicDAO.NUMBER, "Thirty-three", "Số 33"));
        words.add(new Word(TopicDAO.NUMBER, "Thirty-four", "Số 34"));
        words.add(new Word(TopicDAO.NUMBER, "Thirty-five", "Số 35"));
        words.add(new Word(TopicDAO.NUMBER, "Thirty-six", "Số 36"));
        words.add(new Word(TopicDAO.NUMBER, "Thirty-seven", "Số 37"));
        words.add(new Word(TopicDAO.NUMBER, "Thirty-eight", "Số 38"));
        words.add(new Word(TopicDAO.NUMBER, "Thirty-nine", "Số 39"));
        words.add(new Word(TopicDAO.NUMBER, "Forty", "Số 40"));
    }
    private static void initializeSchool(List<Word> words) {
        words.add(new Word(TopicDAO.SCHOOL, "Backpack", "Ba lô"));
        words.add(new Word(TopicDAO.SCHOOL, "Blackboard", "Cái bảng"));
        words.add(new Word(TopicDAO.SCHOOL, "Book", "Sách"));
        words.add(new Word(TopicDAO.SCHOOL, "Notebook", "Quyển vở"));
        words.add(new Word(TopicDAO.SCHOOL, "Teacher", "Giáo viên"));
        words.add(new Word(TopicDAO.SCHOOL, "Brush", "Bút lông"));
        words.add(new Word(TopicDAO.SCHOOL, "Pen", "Cái bút"));
        words.add(new Word(TopicDAO.SCHOOL, "Pencil", "Bút chì"));
        words.add(new Word(TopicDAO.SCHOOL, "Ink", "Mực viết"));
        words.add(new Word(TopicDAO.SCHOOL, "Glue", "Hồ dán"));
        words.add(new Word(TopicDAO.SCHOOL, "Pencil sharpener", "Gọt bút chì"));
        words.add(new Word(TopicDAO.SCHOOL, "Crayon", "Bút chì màu"));
        words.add(new Word(TopicDAO.SCHOOL, "Calculator", "Máy tính"));
        words.add(new Word(TopicDAO.SCHOOL, "Compass", "Com-pa"));
        words.add(new Word(TopicDAO.SCHOOL, "Computer", "Mý vi tính"));
    }

    private static void initializeSport(List<Word> words) {
        words.add(new Word(TopicDAO.SPORT, "Baseball", "Bóng chày"));
        words.add(new Word(TopicDAO.SPORT, "Baseball bat", "Gậy bóng chày"));
        words.add(new Word(TopicDAO.SPORT, "Basketball", "Bóng rổ"));
        words.add(new Word(TopicDAO.SPORT, "Bowling", "Bowling"));
        words.add(new Word(TopicDAO.SPORT, "Boxing", "Quyền anh"));
        words.add(new Word(TopicDAO.SPORT, "Football", "Bóng bầu dục"));
        words.add(new Word(TopicDAO.SPORT, "Golf club", "Gậy đánh gôn"));
        words.add(new Word(TopicDAO.SPORT, "Hockey stick", "Gậy khúc côn cầu"));
        words.add(new Word(TopicDAO.SPORT, "Hurdles", "Chạy vượt rào"));
        words.add(new Word(TopicDAO.SPORT, "Medal", "Huy chương"));
        words.add(new Word(TopicDAO.SPORT, "Parachute", "Nhảy dù"));
        words.add(new Word(TopicDAO.SPORT, "Ping pong", "Bóng bàn"));
        words.add(new Word(TopicDAO.SPORT, "Pole vaulting", "Nhảy sào"));
        words.add(new Word(TopicDAO.SPORT, "Soccer", "Bóng đá"));
        words.add(new Word(TopicDAO.SPORT, "Swimming", "Bơi lội"));
    }

    private static void initializeTraffic(List<Word> words) {
        words.add(new Word(TopicDAO.TRAFFIC, "Motorbike", "Xe máy"));
        words.add(new Word(TopicDAO.TRAFFIC, "Train", "Tàu hỏa"));
        words.add(new Word(TopicDAO.TRAFFIC, "Car", "Xe hơi"));
        words.add(new Word(TopicDAO.TRAFFIC, "Bus", "Xe buýt"));
        words.add(new Word(TopicDAO.TRAFFIC, "Bicycle", "Xe đạp"));
        words.add(new Word(TopicDAO.TRAFFIC, "Airplane", "Máy bay"));
        words.add(new Word(TopicDAO.TRAFFIC, "Boat", "Thuyền"));
        words.add(new Word(TopicDAO.TRAFFIC, "Van", "Xe tải"));
        words.add(new Word(TopicDAO.TRAFFIC, "Tractor", "Máy kéo"));
        words.add(new Word(TopicDAO.TRAFFIC, "Sailboat", "Thuyền buồm"));
        words.add(new Word(TopicDAO.TRAFFIC, "Ambulance", "Xe cứu thương"));
        words.add(new Word(TopicDAO.TRAFFIC, "Truck", "Xe tải"));
        words.add(new Word(TopicDAO.TRAFFIC, "Traffic light", "Đèn giao thông"));
        words.add(new Word(TopicDAO.TRAFFIC, "Canoe", "Ca nô"));
        words.add(new Word(TopicDAO.TRAFFIC, "Motorboat", "Xuồng máy"));
    }

    private static void initializeVegetable(List<Word> words) {
        words.add(new Word(TopicDAO.VEGETABLE, "Tomato", "Cà chua"));
        words.add(new Word(TopicDAO.VEGETABLE, "Potato", "Khoai tây"));
        words.add(new Word(TopicDAO.VEGETABLE, "Corn", "Bắp ngô"));
        words.add(new Word(TopicDAO.VEGETABLE, "Avocado", "Quả bơ"));
        words.add(new Word(TopicDAO.VEGETABLE, "Red pepper", "Ớt ngọt"));
        words.add(new Word(TopicDAO.VEGETABLE, "Loofah", "Quả mướp"));
        words.add(new Word(TopicDAO.VEGETABLE, "Kohlrabi", "Su hào"));
        words.add(new Word(TopicDAO.VEGETABLE, "Taro", "Khoai sọ"));
        words.add(new Word(TopicDAO.VEGETABLE, "Asparagus", "Măng"));
        words.add(new Word(TopicDAO.VEGETABLE, "Bitter melon", "Mướp đắng"));
    }

    private static void initializeWeather(List<Word> words) {
        words.add(new Word(TopicDAO.WEATHER, "Hot", "Nóng nực"));
        words.add(new Word(TopicDAO.WEATHER, "Cool", "Mát mẻ"));
        words.add(new Word(TopicDAO.WEATHER, "Cold", "Lạnh"));
        words.add(new Word(TopicDAO.WEATHER, "Warm", "Ấm áp"));
        words.add(new Word(TopicDAO.WEATHER, "Rain", "Mưa"));
        words.add(new Word(TopicDAO.WEATHER, "Sunshine", "Nắng"));
        words.add(new Word(TopicDAO.WEATHER, "Wind", "Gió"));
        words.add(new Word(TopicDAO.WEATHER, "Snow", "Tuyết"));
        words.add(new Word(TopicDAO.WEATHER, "Fog", "Sương mù"));
        words.add(new Word(TopicDAO.WEATHER, "Wet", "Ẩm ướt"));
    }

    private static void initializeHospital(List<Word> words) {
        words.add(new Word(TopicDAO.HOSPITAL, "Ambulance", "Xe cứu thương"));
        words.add(new Word(TopicDAO.HOSPITAL, "Antibiotic", "Kháng sinh"));
        words.add(new Word(TopicDAO.HOSPITAL, "Appointment", "Lịch khám"));
        words.add(new Word(TopicDAO.HOSPITAL, "Bacteria", "Vi khuẩn"));
        words.add(new Word(TopicDAO.HOSPITAL, "Bleed", "Chảy máu"));
        words.add(new Word(TopicDAO.HOSPITAL, "Blood pressure", "Huyết áp"));
        words.add(new Word(TopicDAO.HOSPITAL, "Blood type", "Nhóm máu"));
        words.add(new Word(TopicDAO.HOSPITAL, "Death", "Tử vong"));
        words.add(new Word(TopicDAO.HOSPITAL, "Diagnose", "Chuẩn đoán"));
        words.add(new Word(TopicDAO.HOSPITAL, "Doctor", "Bác sỹ"));
    }

    private static void initializeRestaurant(List<Word> words) {
        words.add(new Word(TopicDAO.RESTAURANT, "Beef", "Thịt bò"));
        words.add(new Word(TopicDAO.RESTAURANT, "Beverage", "Đồ uống"));
        words.add(new Word(TopicDAO.RESTAURANT, "Bill", "Hóa đơn"));
        words.add(new Word(TopicDAO.RESTAURANT, "Breakfast", "Bữa sáng"));
        words.add(new Word(TopicDAO.RESTAURANT, "Chef", "Đầu bếp"));
        words.add(new Word(TopicDAO.RESTAURANT, "Chicken", "Thịt gà"));
        words.add(new Word(TopicDAO.RESTAURANT, "Coffee", "Cà phê"));
        words.add(new Word(TopicDAO.RESTAURANT, "Dessert", "Đồ tráng miệng"));
        words.add(new Word(TopicDAO.RESTAURANT, "Fork", "Cái đĩa"));
        words.add(new Word(TopicDAO.RESTAURANT, "Menu", "Thực đơn"));
    }

    private static void initializeAdjective(List<Word> words) {
        words.add(new Word(TopicDAO.ADJECTIVE, "Angry", "Tức giận"));
        words.add(new Word(TopicDAO.ADJECTIVE, "Beautiful", "Xinh đẹp"));
        words.add(new Word(TopicDAO.ADJECTIVE, "Careful", "Cẩn thận"));
        words.add(new Word(TopicDAO.ADJECTIVE, "Cute", "Đáng yêu"));
        words.add(new Word(TopicDAO.ADJECTIVE, "Exciting", "Thú vị"));
        words.add(new Word(TopicDAO.ADJECTIVE, "Happy", "Vui vẻ"));
        words.add(new Word(TopicDAO.ADJECTIVE, "Lucky", "May mắn"));
        words.add(new Word(TopicDAO.ADJECTIVE, "Sociable", "Hòa đồng"));
        words.add(new Word(TopicDAO.ADJECTIVE, "Courteous", "Lịch lãm"));
        words.add(new Word(TopicDAO.ADJECTIVE, "Polite", "Lịch sự"));
    }

    private static void initializeAction(List<Word> words) {
        words.add(new Word(TopicDAO.ACTION, "Jump", "Nhảy"));
        words.add(new Word(TopicDAO.ACTION, "Run", "Chạy"));
        words.add(new Word(TopicDAO.ACTION, "Sit", "Ngồi"));
        words.add(new Word(TopicDAO.ACTION, "Stand", "Đứng"));
        words.add(new Word(TopicDAO.ACTION, "Walk", "Đi bộ"));
        words.add(new Word(TopicDAO.ACTION, "Crawl", "Bò,trườn"));
        words.add(new Word(TopicDAO.ACTION, "Sway", "Đu đưa,lắc lư"));
        words.add(new Word(TopicDAO.ACTION, "Shake", "Rung,lắc"));
        words.add(new Word(TopicDAO.ACTION, "Read", "Đọc"));
        words.add(new Word(TopicDAO.ACTION, "Kick", "Đá"));
    }

    // ENGLISH FOR CHILDREN
    private static void initializeClass1(List<Word> words) {
        words.add(new Word(TopicDAO.CLASS1, "Be quiet", "Trật tự"));
        words.add(new Word(TopicDAO.CLASS1, "Listen", "Lắng nghe"));
        words.add(new Word(TopicDAO.CLASS1, "Look", "Quan sát"));
        words.add(new Word(TopicDAO.CLASS1, "Repeat", "Nhắc lại"));
        words.add(new Word(TopicDAO.CLASS1, "Mother", "Mẹ"));
        words.add(new Word(TopicDAO.CLASS1, "Father", "Bố"));
        words.add(new Word(TopicDAO.CLASS1, "Baby", "Em bé"));
        words.add(new Word(TopicDAO.CLASS1, "Good morning", "Chào buổi sáng"));
        words.add(new Word(TopicDAO.CLASS1, "Good afternoon", "Chiều buổi chiều"));
    }

    private static void initializeClass2(List<Word> words) {
        words.add(new Word(TopicDAO.CLASS2, "Bus", "Xe buýt"));
        words.add(new Word(TopicDAO.CLASS2, "Classroom", "Phòng học"));
        words.add(new Word(TopicDAO.CLASS2, "Library", "Thư viện"));
        words.add(new Word(TopicDAO.CLASS2, "Teacher", "Giáo viên"));
        words.add(new Word(TopicDAO.CLASS2, "Board", "Bảng"));
        words.add(new Word(TopicDAO.CLASS2, "Monday", "Thứ 2"));
        words.add(new Word(TopicDAO.CLASS2, "Tuesday", "Thứ 3"));
        words.add(new Word(TopicDAO.CLASS2, "Wednesday", "Thứ 4"));
        words.add(new Word(TopicDAO.CLASS2, "Thursday", "Thứ 5"));
    }

    private static void initializeClass3(List<Word> words) {
        words.add(new Word(TopicDAO.CLASS3, "Red", "Màu đỏ", "My jacket is red"));
        words.add(new Word(TopicDAO.CLASS3, "Yellow", "Màu vàng", "I like yellow skirts"));
        words.add(new Word(TopicDAO.CLASS3, "Book", "Quyển sách", "I have 2 beautiful books"));
        words.add(new Word(TopicDAO.CLASS3, "Chair", "Ghế", "I just bought this chair"));
        words.add(new Word(TopicDAO.CLASS3, "Table", "Bàn", "This table is beautiful"));
        words.add(new Word(TopicDAO.CLASS3, "Left", "Bên trái", "It is on the left side of the road"));
        words.add(new Word(TopicDAO.CLASS3, "Right", "Bên phải", "Turn right at the fork"));
        words.add(new Word(TopicDAO.CLASS3, "Next to", "Bên cạnh", "It is next to the book"));
        words.add(new Word(TopicDAO.CLASS3, "Under", "Bên dưới", "Ants under the Bridge"));
        words.add(new Word(TopicDAO.CLASS3, "Street", "Đường phố", "The street is bustling"));
        words.add(new Word(TopicDAO.CLASS3, "Tree", "Cây", "Trees are green on both sides of the road"));
        words.add(new Word(TopicDAO.CLASS3, "Plane", "Máy bay", "The plane is flying overhead"));
        words.add(new Word(TopicDAO.CLASS3, "Ship", "Tàu biển", "Ships are leaving port"));
        words.add(new Word(TopicDAO.CLASS3, "Shoe", "Giày", "This shoe I really like"));
        words.add(new Word(TopicDAO.CLASS3, "Hat", "Mũ", "The black hat is cool"));
    }

    private static void initializeClass4(List<Word> words) {
        words.add(new Word(TopicDAO.CLASS4, "Mountain", "Núi"));
        words.add(new Word(TopicDAO.CLASS4, "Forest", "Rừng"));
        words.add(new Word(TopicDAO.CLASS4, "River", "Sông"));
        words.add(new Word(TopicDAO.CLASS4, "Ocean", "Đại dương"));
        words.add(new Word(TopicDAO.CLASS4, "Hill", "Đồi"));
        words.add(new Word(TopicDAO.CLASS4, "Birthday", "Ngày sinh nhật"));
        words.add(new Word(TopicDAO.CLASS4, "Candle", "Nến"));
        words.add(new Word(TopicDAO.CLASS4, "Gift", "Quà"));
        words.add(new Word(TopicDAO.CLASS4, "Party", "Bữa tiệc"));
        words.add(new Word(TopicDAO.CLASS4, "Invitation", "Lời mời"));
        words.add(new Word(TopicDAO.CLASS4, "Street", "Đường phố"));
        words.add(new Word(TopicDAO.CLASS4, "Bank", "Ngân hàng"));
        words.add(new Word(TopicDAO.CLASS4, "Church", "Nhà thờ"));
        words.add(new Word(TopicDAO.CLASS4, "Cinema", "Rạp chiếu phim"));
        words.add(new Word(TopicDAO.CLASS4, "Hotel", "Khách sạn"));
        words.add(new Word(TopicDAO.CLASS4, "Library", "Thư viện"));
        words.add(new Word(TopicDAO.CLASS4, "Museum", "Bảo tàng"));
        words.add(new Word(TopicDAO.CLASS4, "Hospital", "Bệnh viện"));
        words.add(new Word(TopicDAO.CLASS4, "Farmer", "Nông dân"));
        words.add(new Word(TopicDAO.CLASS4, "Pilot", "Phi công"));
        words.add(new Word(TopicDAO.CLASS4, "Policeman", "Cảnh sát"));
        words.add(new Word(TopicDAO.CLASS4, "Musician", "Nhạc sĩ"));
        words.add(new Word(TopicDAO.CLASS4, "Singer", "Ca sĩ"));
        words.add(new Word(TopicDAO.CLASS4, "Worker", "Công nhân"));
        words.add(new Word(TopicDAO.CLASS4, "Doctor", "Bác sĩ"));
        words.add(new Word(TopicDAO.CLASS4, "Dentist", "Nha sĩ"));
        words.add(new Word(TopicDAO.CLASS4, "Nurse", "Y tá"));
        words.add(new Word(TopicDAO.CLASS4, "Postman", "Người đưa thư"));
    }

    private static void initializeClass5(List<Word> words) {
        words.add(new Word(TopicDAO.CLASS5, "Sick", "Ốm"));
        words.add(new Word(TopicDAO.CLASS5, "Pain", "Đau"));
        words.add(new Word(TopicDAO.CLASS5, "Headache", "Đau đầu"));
        words.add(new Word(TopicDAO.CLASS5, "Fever", "Sốt"));
        words.add(new Word(TopicDAO.CLASS5, "Cough", "Ho"));
        words.add(new Word(TopicDAO.CLASS5, "Ambulance", "Xe cứu thương"));
        words.add(new Word(TopicDAO.CLASS5, "Fire", "Lửa"));
        words.add(new Word(TopicDAO.CLASS5, "Knife", "Con dao"));
        words.add(new Word(TopicDAO.CLASS5, "Stove", "Bếp"));
        words.add(new Word(TopicDAO.CLASS5, "Match", "Diêm quẹt"));
        words.add(new Word(TopicDAO.CLASS5, "Street", "Đường phố"));
        words.add(new Word(TopicDAO.CLASS5, "Scissors", "Cây kéo"));
        words.add(new Word(TopicDAO.CLASS5, "Tool", "Dụng cụ"));
        words.add(new Word(TopicDAO.CLASS5, "Helmet", "Mũ bảo hiểm"));
        words.add(new Word(TopicDAO.CLASS5, "Stair", "Cầu thang"));
        words.add(new Word(TopicDAO.CLASS5, "Hold", "Cầm"));
        words.add(new Word(TopicDAO.CLASS5, "Hall", "Ngã"));
        words.add(new Word(TopicDAO.CLASS5, "Break", "Gãy"));
        words.add(new Word(TopicDAO.CLASS5, "Usually", "Thông thường"));
        words.add(new Word(TopicDAO.CLASS5, "Sometimes", "Thỉnh thoảng"));
        words.add(new Word(TopicDAO.CLASS5, "Boring", "Nhàm chán"));
        words.add(new Word(TopicDAO.CLASS5, "Circus", "Rạp xiếc"));
        words.add(new Word(TopicDAO.CLASS5, "Cute", "Dễ thương"));
        words.add(new Word(TopicDAO.CLASS5, "Loudly", "To"));
        words.add(new Word(TopicDAO.CLASS5, "Python", "Con trăn"));
        words.add(new Word(TopicDAO.CLASS5, "Quickly", "Nhanh nhẹn"));
        words.add(new Word(TopicDAO.CLASS5, "Roar", "Gầm"));
        words.add(new Word(TopicDAO.CLASS5, "Swan", "Thiên nga"));
    }

    //ENGLISH FOR HIGH SCHOOL
    private static void initializeClass6(List<Word> words) {
        words.add(new Word(TopicDAO.CLASS6, "Country", "Đất nước", "My country is wonderful"));
        words.add(new Word(TopicDAO.CLASS6, "Live", "Sống", "They need to live through tonight"));
        words.add(new Word(TopicDAO.CLASS6, "Busy", "Bận rộn", "I am very busy today"));
        words.add(new Word(TopicDAO.CLASS6, "Large", "Lớn", "The plane is large"));
        words.add(new Word(TopicDAO.CLASS6, "Beautiful", "Đẹp", "The flower is beautiful"));
        words.add(new Word(TopicDAO.CLASS6, "Quiet", "Yên tĩnh", "I need quiet in the room"));
        words.add(new Word(TopicDAO.CLASS6, "Small", "Nhỏ", "The ant has a very small body"));
        words.add(new Word(TopicDAO.CLASS6, "Flat", "Căn hộ", "That flat is very large"));
        words.add(new Word(TopicDAO.CLASS6, "Glass", "Kính", "This glass is very fragile"));
        words.add(new Word(TopicDAO.CLASS6, "Address", "Địa chỉ", "Address is on paper"));
        words.add(new Word(TopicDAO.CLASS6, "House", "Ngôi nhà", "The house is yellow"));
        words.add(new Word(TopicDAO.CLASS6, "Bedroom", "Phòng ngủ", "This bedroom is so big"));
        words.add(new Word(TopicDAO.CLASS6, "Kitchen", "Nhà bếp", "She is cooking in the kitchen"));
        words.add(new Word(TopicDAO.CLASS6, "Drink", "Đồ uống", "The drink is delicious"));
        words.add(new Word(TopicDAO.CLASS6, "Meal", "Bữa ăn", "The meal is special"));
    }

    private static void initializeClass7(List<Word> words) {
        words.add(new Word(TopicDAO.CLASS7, "Far", "Xa"));
        words.add(new Word(TopicDAO.CLASS7, "Different", "Khác nhau"));
        words.add(new Word(TopicDAO.CLASS7, "Nice", "Vui"));
        words.add(new Word(TopicDAO.CLASS7, "Fine", "Ổn"));
        words.add(new Word(TopicDAO.CLASS7, "Parent", "Bố mẹ"));
        words.add(new Word(TopicDAO.CLASS7, "Market", "Chợ"));
        words.add(new Word(TopicDAO.CLASS7, "Movie", "Bộ phim"));
        words.add(new Word(TopicDAO.CLASS7, "Join", "Tham gia"));
        words.add(new Word(TopicDAO.CLASS7, "Finish", "Kết thúc"));
    }

    private static void initializeClass8(List<Word> words) {
        words.add(new Word(TopicDAO.CLASS8, "Public", "Công cộng"));
        words.add(new Word(TopicDAO.CLASS8, "Laugh ", "Cười"));
        words.add(new Word(TopicDAO.CLASS8, "Photograph ", "Bức ảnh"));
        words.add(new Word(TopicDAO.CLASS8, "Enough", "Đủ"));
        words.add(new Word(TopicDAO.CLASS8, "Introduce ", "Giới thiệu"));
        words.add(new Word(TopicDAO.CLASS8, "Blond ", "Vàng hoe"));
        words.add(new Word(TopicDAO.CLASS8, "Straight ", "Thẳng"));
        words.add(new Word(TopicDAO.CLASS8, "Planet", "Hành tinh"));
        words.add(new Word(TopicDAO.CLASS8, "Curly ", "Xoăn"));
        words.add(new Word(TopicDAO.CLASS8, "Earth ", "Trái Đất"));
        words.add(new Word(TopicDAO.CLASS8, "Moon ", "Mặt trăng"));
        words.add(new Word(TopicDAO.CLASS8, "Carry ", "Mang,vác"));
        words.add(new Word(TopicDAO.CLASS8, "Perhaps", "Có lẽ"));
        words.add(new Word(TopicDAO.CLASS8, "Agree", "Đồng ý"));
        words.add(new Word(TopicDAO.CLASS8, "Speech ", "Giọng nói"));
        words.add(new Word(TopicDAO.CLASS8, "Furniture ", "Nội thất"));
    }

    private static void initializeClass9(List<Word> words) {
        words.add(new Word(TopicDAO.CLASS9, "Region", "Vùng, miền"));
        words.add(new Word(TopicDAO.CLASS9, "Separate", "Ngăn cách"));
        words.add(new Word(TopicDAO.CLASS9, "Climate", "Khí hậu"));
        words.add(new Word(TopicDAO.CLASS9, "Currency", "Tiền tệ"));
        words.add(new Word(TopicDAO.CLASS9, "Islam", "Đạo hổi"));
        words.add(new Word(TopicDAO.CLASS9, "Market", "Chợ"));
        words.add(new Word(TopicDAO.CLASS9, "Religion", "Tôn giáo"));
        words.add(new Word(TopicDAO.CLASS9, "Official", "Chính thức"));
        words.add(new Word(TopicDAO.CLASS9, "Finish", "Kết thúc"));
        words.add(new Word(TopicDAO.CLASS9, "Primary", "Chính"));
        words.add(new Word(TopicDAO.CLASS9, "Clothes", "Quần áo"));
        words.add(new Word(TopicDAO.CLASS9, "Sport", "Thể thao"));
        words.add(new Word(TopicDAO.CLASS9, "Poem", "Bài thơ"));
        words.add(new Word(TopicDAO.CLASS9, "Tight", "Chật"));
        words.add(new Word(TopicDAO.CLASS9, "Join", "Tham gia"));
        words.add(new Word(TopicDAO.CLASS9, "Modern", "Hiện đại"));
    }

    //ENGLISH FOR OFFICE
    private static void initializePositions(List<Word> words) {
        words.add(new Word(TopicDAO.POSITION, "Boss", "Sếp", "The boss is on a business trip in Hanoi"));
        words.add(new Word(TopicDAO.POSITION, "President", "Chủ tịch", "The president is the head of the company"));
        words.add(new Word(TopicDAO.POSITION, "Vice president", "Phó chủ tịch", " Vice president is the 2nd largest position in the company"));
        words.add(new Word(TopicDAO.POSITION, "Director", "Giám đốc", "My director is very caring staff"));
        words.add(new Word(TopicDAO.POSITION, "Manager", "Quản lý", "Mr. Nam is the PO project manager"));
        words.add(new Word(TopicDAO.POSITION, "Leader", "Lãnh đạo", "The leader of Mama Company is very young"));
        words.add(new Word(TopicDAO.POSITION, "Secretary", "Thư ký", "The secretary always arranges a schedule for the director"));
        words.add(new Word(TopicDAO.POSITION, "Expert", "Chuyên gia", "Mrs Juner is a famous expert"));
        words.add(new Word(TopicDAO.POSITION, "Department manage", "Trưởng phòng", "I'm going to eat with the department manager"));
        words.add(new Word(TopicDAO.POSITION, "Founder", "Chuyên gia", "Mr Honda is the founder of this company"));
        words.add(new Word(TopicDAO.POSITION, "Chief accountant", "Kế toán trưởng", "Chief accountant is very busy today"));
        words.add(new Word(TopicDAO.POSITION, "Supervisor", "Người dám sát", "I am the supervisor of this project"));
    }

    private static void initializeDepartments(List<Word> words) {
        words.add(new Word(TopicDAO.DEPARTMENT, "Accounting department", "Phòng kế toán"));
        words.add(new Word(TopicDAO.DEPARTMENT, "Audit department", "Phòng kiểm toán"));
        words.add(new Word(TopicDAO.DEPARTMENT, "Sales department", "Phòng kinh doanh"));
        words.add(new Word(TopicDAO.DEPARTMENT, "Administration department", "Phòng hành chính"));
        words.add(new Word(TopicDAO.DEPARTMENT, "Human Resources department", "Phòng nhân sự"));
        words.add(new Word(TopicDAO.DEPARTMENT, "Financial department", "Phòng tài chính"));
        words.add(new Word(TopicDAO.DEPARTMENT, "Quality department", "Phòng chất lượng"));
    }

    private static void initializeSupply(List<Word> words) {
        words.add(new Word(TopicDAO.SUPPLY, "Staples", "Ghim bấm"));
        words.add(new Word(TopicDAO.SUPPLY, "Scissors", "Cây kéo"));
        words.add(new Word(TopicDAO.SUPPLY, "Pen", "Bút bi"));
        words.add(new Word(TopicDAO.SUPPLY, "Pencil", "Bút chì"));
        words.add(new Word(TopicDAO.SUPPLY, "Eraser", "Tẩy"));
        words.add(new Word(TopicDAO.SUPPLY, "Calculator", "Máy tính cầm tay"));
        words.add(new Word(TopicDAO.SUPPLY, "Ruler", "Thước đo"));
        words.add(new Word(TopicDAO.SUPPLY, "Notebook", "Sổ tay"));
        words.add(new Word(TopicDAO.SUPPLY, "Glue", "Keo hồ"));
        words.add(new Word(TopicDAO.SUPPLY, "Binder", "Bìa cứng"));
        words.add(new Word(TopicDAO.SUPPLY, "Tape", "Băng dán"));
        words.add(new Word(TopicDAO.SUPPLY, "Highlighter", "Bút dạ quang"));
        words.add(new Word(TopicDAO.SUPPLY, "Paper clip", "Kẹp giấy"));
    }

    private static void initializeBenefit(List<Word> words) {
        words.add(new Word(TopicDAO.BENEFIT, "Income", "Thu nhập"));
        words.add(new Word(TopicDAO.BENEFIT, "Salary ", "Lương"));
        words.add(new Word(TopicDAO.BENEFIT, "Wage", "Tiền công"));
        words.add(new Word(TopicDAO.BENEFIT, "Compensation", "Thù lao"));
        words.add(new Word(TopicDAO.BENEFIT, "Pension", "Lương hưu"));
        words.add(new Word(TopicDAO.BENEFIT, "Pay raise", "Sự tăng lương"));
        words.add(new Word(TopicDAO.BENEFIT, "Bonus", "Tiền thưởng"));
        words.add(new Word(TopicDAO.BENEFIT, "Allowance ", "Trợ cấp"));
        words.add(new Word(TopicDAO.BENEFIT, "Commission ", "Hoa hồng"));
        words.add(new Word(TopicDAO.BENEFIT, "Overtime pay", "Tiền làm thêm"));
        words.add(new Word(TopicDAO.BENEFIT, "Severance ", "Trợ cấp thôi việc"));
        words.add(new Word(TopicDAO.BENEFIT, "Incentive ", "Thưởng khích lệ"));
        words.add(new Word(TopicDAO.BENEFIT, "Sick leave", "Nghỉ ốm"));
        words.add(new Word(TopicDAO.BENEFIT, "Maternity leave", "Nghỉ sinh"));
        words.add(new Word(TopicDAO.BENEFIT, "Raise ", "Sự tăng lương"));
        words.add(new Word(TopicDAO.BENEFIT, "Job promotion ", "Sự thăng chức"));
        words.add(new Word(TopicDAO.BENEFIT, "Unpaid leave", "Lương nghỉ"));
    }


    private static void initializeConferences(List<Word> words) {
        words.add(new Word(TopicDAO.CONFERENCE, "Arrange", "Sắp xếp"));
        words.add(new Word(TopicDAO.CONFERENCE, "Meeting", "Cuộc họp"));
        words.add(new Word(TopicDAO.CONFERENCE, "Projector", "Máy chiếu"));
        words.add(new Word(TopicDAO.CONFERENCE, "Select", "Lựa chọn"));
        words.add(new Word(TopicDAO.CONFERENCE, "Register", "Đăng ký"));
        words.add(new Word(TopicDAO.CONFERENCE, "Take part in", "Tham gia"));
        words.add(new Word(TopicDAO.CONFERENCE, "Micro", "Míc"));
        words.add(new Word(TopicDAO.CONFERENCE, "Screen", "Màn hình"));
    }

    //ENGLISH FOR PROGRAMMING
    private static void initializeStructure(List<Word> words) {
        words.add(new Word(TopicDAO.STRUCTURE, "Operating system", "Hệ điều hành"));
        words.add(new Word(TopicDAO.STRUCTURE, "Cluster controller", "Bộ điều khiển trùm"));
        words.add(new Word(TopicDAO.STRUCTURE, "Gateway", "Cổng kết nối Internet"));
        words.add(new Word(TopicDAO.STRUCTURE, "OSI", "Mô hình chuẩn OSI"));
        words.add(new Word(TopicDAO.STRUCTURE, "Packet", "Gói dữ liệu"));
        words.add(new Word(TopicDAO.STRUCTURE, "Port", "Cổng"));
        words.add(new Word(TopicDAO.STRUCTURE, "Memory", "bộ nhớ"));
        words.add(new Word(TopicDAO.STRUCTURE, "Microprocessor", "bộ vi xử lý"));
        words.add(new Word(TopicDAO.STRUCTURE, "Storage", "lưu trữ"));
        words.add(new Word(TopicDAO.STRUCTURE, "Graphics", "đồ họa"));
        words.add(new Word(TopicDAO.STRUCTURE, "Hardware", "Phần cứng"));
        words.add(new Word(TopicDAO.STRUCTURE, "Software", "phần mềm"));
        words.add(new Word(TopicDAO.STRUCTURE, "Configuration", "Cấu hình"));
        words.add(new Word(TopicDAO.STRUCTURE, "Protocol", "Giao thức"));
        words.add(new Word(TopicDAO.STRUCTURE, "Intranet", "mạng nội bộ"));
        words.add(new Word(TopicDAO.STRUCTURE, "Resource", "nguồn"));
        words.add(new Word(TopicDAO.STRUCTURE, "Circuit", "Mạch"));
        words.add(new Word(TopicDAO.STRUCTURE, "Main memory system", "Hệ thống bộ nhớ chính"));
        words.add(new Word(TopicDAO.STRUCTURE, "Registers", "Các thanh ghi"));
        words.add(new Word(TopicDAO.STRUCTURE, "Input", "Bộ vào"));
        words.add(new Word(TopicDAO.STRUCTURE, "Output", "Bộ ra"));
        words.add(new Word(TopicDAO.STRUCTURE, "Cache memory", "Bộ nhớ Cache"));
        words.add(new Word(TopicDAO.STRUCTURE, "Instruction ", "Hướng dẫn"));
        words.add(new Word(TopicDAO.STRUCTURE, "Program", "Chương trình"));
        words.add(new Word(TopicDAO.STRUCTURE, "Secondary memory", "Bộ nhớ phụ"));
        words.add(new Word(TopicDAO.STRUCTURE, "Floppy disk", "Đĩa mềm"));
        words.add(new Word(TopicDAO.STRUCTURE, "Hard disk", "Đĩa cứng"));
        words.add(new Word(TopicDAO.STRUCTURE, "Compact disk", "Đĩa quang"));
        words.add(new Word(TopicDAO.STRUCTURE, "Memory stick", "Thẻ nhớ"));
        words.add(new Word(TopicDAO.STRUCTURE, "Function keypad", "Nhóm phím chức năng"));
    }

    private static void initializeJobs(List<Word> words) {
        words.add(new Word(TopicDAO.JOBS, "Software developer", "Nhà phát triển phần mềm"));
        words.add(new Word(TopicDAO.JOBS, "Computer programmer", "Lập trình viên"));
        words.add(new Word(TopicDAO.JOBS, "Computer system analyst", "Phân tích hệ thống"));
        words.add(new Word(TopicDAO.JOBS, "Web developer", "Phát triển web"));
        words.add(new Word(TopicDAO.JOBS, "Application Programming", "Lập trình ứng dụng"));
        words.add(new Word(TopicDAO.JOBS, "Database Administrator", "Quản trị cơ sở dữ liệu"));
        words.add(new Word(TopicDAO.JOBS, "Game design", "Thiết kế game"));
        words.add(new Word(TopicDAO.JOBS, "Network administrator", "Quản trị mạng"));
        words.add(new Word(TopicDAO.JOBS, "Security specialist", "Chuyên gia bảo mật"));
        words.add(new Word(TopicDAO.JOBS, "Medical engineering", "Y tế kĩ thuật"));
        words.add(new Word(TopicDAO.JOBS, "Embedded programming", "Lập trình nhúng"));
        words.add(new Word(TopicDAO.JOBS, "Artificial intelligence", "Trí tuệ nhân tạo"));
        words.add(new Word(TopicDAO.JOBS, "Algorithm development", "Phát triển thuật toán"));
        words.add(new Word(TopicDAO.JOBS, "Interface design", "Thiết kế giao diện"));
        words.add(new Word(TopicDAO.JOBS, "Project management", "Quản lý dự án"));
        words.add(new Word(TopicDAO.JOBS, "Recruitment", "Tuyển dụng"));

    }

    private static void initializeEquipments(List<Word> words) {
        words.add(new Word(TopicDAO.EQUIPMENT, "Lights", "Đèn điện", "The lights is on all night"));
        words.add(new Word(TopicDAO.EQUIPMENT, "Computer", "Máy tính", "This computer is very beautiful"));
        words.add(new Word(TopicDAO.EQUIPMENT, "Projector", "Máy chiếu", "I need a projector now"));
        words.add(new Word(TopicDAO.EQUIPMENT, "Print", "Máy in", "Take it to the printer"));
        words.add(new Word(TopicDAO.EQUIPMENT, "Scanner", "Máy scan", "I need a scanner now"));
        words.add(new Word(TopicDAO.EQUIPMENT, "Television", "Tivi", "The program is broadcast on television"));
        words.add(new Word(TopicDAO.EQUIPMENT, "Fax", "Máy fax", "Paper on fax machine"));
        words.add(new Word(TopicDAO.EQUIPMENT, "Harmonic", "Điều hòa", "Harmonic is widely used"));
        words.add(new Word(TopicDAO.EQUIPMENT, "Fan", "Quạt", "The fan is very cool in this weather"));
    }

    //ENGLISH FOR TRAVEL
    private static void initializeHotels(List<Word> words) {
        words.add(new Word(TopicDAO.HOTEL, "Reservation", "Đặt phòng", "You need to make a reservation before traveling"));
        words.add(new Word(TopicDAO.HOTEL, "Vacancy", "Phòng trống", "The hotel has 2 rooms vacancy"));
        words.add(new Word(TopicDAO.HOTEL, "Lobby", "Sảnh", "She is down the lobby"));
        words.add(new Word(TopicDAO.HOTEL, "Receptionist", "Lễ tân", "The receptionist is very funny"));
        words.add(new Word(TopicDAO.HOTEL, "Key", "Chìa khóa", "You need a key to open a room"));
        words.add(new Word(TopicDAO.HOTEL, "Pay", "Thanh toán", "Pay in the lobby"));
        words.add(new Word(TopicDAO.HOTEL, "Luggage", "Hành lý", "Bring luggage for me"));
        words.add(new Word(TopicDAO.HOTEL, "Meal", "Bữa ăn", "The hotel has prepared meals"));
        words.add(new Word(TopicDAO.HOTEL, "Room", "Phòng", "Room needs to be locked"));
        words.add(new Word(TopicDAO.HOTEL, "Drink", "Đồ uống", "Do you have a drink?"));
        words.add(new Word(TopicDAO.HOTEL, "Corridor", "Hành lang", "It is located in the left corridor"));
        words.add(new Word(TopicDAO.HOTEL, "Balcony", "Ban công", "Very cool balcony"));
        words.add(new Word(TopicDAO.HOTEL, "Clean", "Sạch sẽ", "The room must be clean"));
        words.add(new Word(TopicDAO.HOTEL, "Safe", "An toàn", "Pay attention to safe"));
        words.add(new Word(TopicDAO.HOTEL, "Manager", "Quản lý", "She is the manager here"));
    }

    private static void initializeSea(List<Word> words) {
        words.add(new Word(TopicDAO.SEA, "Ocean", "Đại dương"));
        words.add(new Word(TopicDAO.SEA, "Wave", "Sóng"));
        words.add(new Word(TopicDAO.SEA, "Island", "Đảo"));
        words.add(new Word(TopicDAO.SEA, "Harbor", "Cảng"));
        words.add(new Word(TopicDAO.SEA, "Submarine", "Tàu ngầm"));
        words.add(new Word(TopicDAO.SEA, "Ship", "Tàu"));
        words.add(new Word(TopicDAO.SEA, "Boat", "Thuyền"));
        words.add(new Word(TopicDAO.SEA, "Captain", "Thuyền trưởng"));
        words.add(new Word(TopicDAO.SEA, "Seashore", "Bờ biển"));
        words.add(new Word(TopicDAO.SEA, "Beach", "Biển"));
        words.add(new Word(TopicDAO.SEA, "Whale", "Cá voi"));
        words.add(new Word(TopicDAO.SEA, "Shark", "Cá mập"));
        words.add(new Word(TopicDAO.SEA, "Dolphin", "Cá heo"));
        words.add(new Word(TopicDAO.SEA, "Coral", "San hô"));
        words.add(new Word(TopicDAO.SEA, "Turtle", "Rùa"));
        words.add(new Word(TopicDAO.SEA, "Crab", "Cua"));
    }

    private static void initializePlane(List<Word> words) {
        words.add(new Word(TopicDAO.PLANE, "Aisle", "Lối đi"));
        words.add(new Word(TopicDAO.PLANE, "Armrest", "Chỗ gác tay"));
        words.add(new Word(TopicDAO.PLANE, "Baggage", "Hành lý"));
        words.add(new Word(TopicDAO.PLANE, "Arrival halls", "Khu vực đến"));
        words.add(new Word(TopicDAO.PLANE, "Cabin", "Buồng Ca-bin"));
        words.add(new Word(TopicDAO.PLANE, "Call button", "Nút gọi"));
        words.add(new Word(TopicDAO.PLANE, "Check-in", "Làm thủ tục"));
        words.add(new Word(TopicDAO.PLANE, "Desk", "Quầy đăng ký"));
        words.add(new Word(TopicDAO.PLANE, "Cockpit", "Buông lái"));
        words.add(new Word(TopicDAO.PLANE, "Conveyor belt", "Băng tải"));
        words.add(new Word(TopicDAO.PLANE, "Copilot", "Phi công phụ"));
        words.add(new Word(TopicDAO.PLANE, "Customs", "Hải quan"));
        words.add(new Word(TopicDAO.PLANE, "Engine", "Động cơ"));
        words.add(new Word(TopicDAO.PLANE, "Gallery", "Hành lang"));
        words.add(new Word(TopicDAO.PLANE, "Gate", "Cửa"));
        words.add(new Word(TopicDAO.PLANE, "Passport", "Hộ chiếu"));
    }

    //IELTS
    private static void initializeOverview(List<Word> words) {
        words.add(new Word(TopicDAO.OVERVIEW, "Education", "Giáo dục", "Education is growing"));
        words.add(new Word(TopicDAO.OVERVIEW, "Crime", "Tội phạm","Crime reward lurks very carefully"));
        words.add(new Word(TopicDAO.OVERVIEW, "Technology", "Công nghệ", "Technology is popular in the world"));
        words.add(new Word(TopicDAO.OVERVIEW, "Environment", "Môi trường", "The marine environment is polluted"));
        words.add(new Word(TopicDAO.OVERVIEW, "Science", "Khoa học", "Khám phá khoa học trên thư viện"));
        words.add(new Word(TopicDAO.OVERVIEW, "Advertising ", "Quảng cáo", "Advertising appear on the television"));
        words.add(new Word(TopicDAO.OVERVIEW, "Work", "Công việc", "IT is my favorite work"));
        words.add(new Word(TopicDAO.OVERVIEW, "City", "Thành phố", "Hanoi is a modern city"));
        words.add(new Word(TopicDAO.OVERVIEW, "Contact", "Liên lạc", "I could not contact anyone"));
        words.add(new Word(TopicDAO.OVERVIEW, "Student", "Sinh viên", "Students are very active"));
        words.add(new Word(TopicDAO.OVERVIEW, "Company", "Công ty", "I am working at the company"));
        words.add(new Word(TopicDAO.OVERVIEW, "Bank", "Ngân hàng", "Banks are in trouble"));
        words.add(new Word(TopicDAO.OVERVIEW, "Book", "Quyển sách", "This book is quite good"));
        words.add(new Word(TopicDAO.OVERVIEW, "Clothes", "Quần áo", "This store a lot of beautiful clothes"));
        words.add(new Word(TopicDAO.OVERVIEW, "Color", "Màu sắc", "What is your favorite color?"));


    }

    //TOEIC
    private static void initializeContracts(List<Word> words) {
        words.add(new Word(TopicDAO.CONTRACTS, "Agree ", "Đồng ý", "I agree with this decision"));
        words.add(new Word(TopicDAO.CONTRACTS, "Assure ", "Đảm bảo","I assure you will not be late"));
        words.add(new Word(TopicDAO.CONTRACTS, "Determine ", "Quyết định", "She determine to leave"));
        words.add(new Word(TopicDAO.CONTRACTS, "Engage ", "Thuê", "I engage this motorbike 3 days"));
        words.add(new Word(TopicDAO.CONTRACTS, "Provide ", "Cung cấp", "PO Company provides drinking water"));
        words.add(new Word(TopicDAO.CONTRACTS, "Specify ", "Xác định", "You have to specify the way"));
        words.add(new Word(TopicDAO.CONTRACTS, "Resolve ", "Giải quyết", "This issue has not been resolved"));
        words.add(new Word(TopicDAO.CONTRACTS, "Cooperate", "Hợp tác", "Happy cooperation"));
        words.add(new Word(TopicDAO.CONTRACTS, "Establish ", "Thiết lập", "This company has been established for 2 years"));
    }

    private static void initializeShopping(List<Word> words) {
        words.add(new Word(TopicDAO.SHOPPING, "Refund", "Hoàn tiền"));
        words.add(new Word(TopicDAO.SHOPPING, "Receipt ", "Hóa đơn"));
        words.add(new Word(TopicDAO.SHOPPING, "Queue ", "Xếp hàng"));
        words.add(new Word(TopicDAO.SHOPPING, "Out of stock", "Hết hàng"));
        words.add(new Word(TopicDAO.SHOPPING, "In stock", "Còn hàng"));
        words.add(new Word(TopicDAO.SHOPPING, "Credit card", "Thẻ tín dụng"));
        words.add(new Word(TopicDAO.SHOPPING, "Cash", "Tiền mặt"));
        words.add(new Word(TopicDAO.SHOPPING, "Cashier", "Thu ngân"));
        words.add(new Word(TopicDAO.SHOPPING, "Trolley", "Xe đầy hàng"));
        words.add(new Word(TopicDAO.SHOPPING, "Shop assistant", "Nhân viên bán hàng"));
        words.add(new Word(TopicDAO.SHOPPING, "Shelf", "Kệ"));
        words.add(new Word(TopicDAO.SHOPPING, "Manager", "Quản lý"));
        words.add(new Word(TopicDAO.SHOPPING, "Fitting room", "Phòng thay đồ"));
        words.add(new Word(TopicDAO.SHOPPING, "Counter ", "Quầy"));
        words.add(new Word(TopicDAO.SHOPPING, "Basket", "Cái giỏ"));
        words.add(new Word(TopicDAO.SHOPPING, "Aisle", "Lối đi"));
        words.add(new Word(TopicDAO.SHOPPING, "Order", "Đặt hàng"));
        words.add(new Word(TopicDAO.SHOPPING, "Sell", "Bán"));
        words.add(new Word(TopicDAO.SHOPPING, "Buy", "Mua"));
        words.add(new Word(TopicDAO.SHOPPING, "Special offer", "Khuyến mãi đặc biệt"));
        words.add(new Word(TopicDAO.SHOPPING, "Shopping bag", "Túi mua hàng"));
        words.add(new Word(TopicDAO.SHOPPING, "Sale", "Giảm giá"));
        words.add(new Word(TopicDAO.SHOPPING, "Price", "Giá"));
        words.add(new Word(TopicDAO.SHOPPING, "Discount", "Chiết khấu"));
        words.add(new Word(TopicDAO.SHOPPING, "Shop", "Cửa hàng"));
        words.add(new Word(TopicDAO.SHOPPING, "Expensive ", "Đắt đỏ"));
        words.add(new Word(TopicDAO.SHOPPING, "Customer", "Khách hàng"));
    }

    private static void initializeMarketing(List<Word> words) {
        words.add(new Word(TopicDAO.MARKETING, "Advertising", "Quảng cáo"));
        words.add(new Word(TopicDAO.MARKETING, "Benefit", "Lợi ích"));
        words.add(new Word(TopicDAO.MARKETING, "Brand equity", "Giá trị thương hiệu"));
        words.add(new Word(TopicDAO.MARKETING, "Brand name", "Tên thương hiệu"));
        words.add(new Word(TopicDAO.MARKETING, "Break-even analysis", "Phân tích hòa vốn"));
        words.add(new Word(TopicDAO.MARKETING, "Buyer", "Người mua"));
        words.add(new Word(TopicDAO.MARKETING, "Cash rebate", "Phiếu giảm giá"));
        words.add(new Word(TopicDAO.MARKETING, "Channel level", "Cấp kênh"));
        words.add(new Word(TopicDAO.MARKETING, "Channels", "Kênh"));
        words.add(new Word(TopicDAO.MARKETING, "Consumer", "Người tiêu dùng"));
        words.add(new Word(TopicDAO.MARKETING, "Copyright", "Bản quyền"));
        words.add(new Word(TopicDAO.MARKETING, "Cost", "Phí"));
        words.add(new Word(TopicDAO.MARKETING, "Culture", "Văn hóa"));
        words.add(new Word(TopicDAO.MARKETING, "Customer", "Khách hàng"));
        words.add(new Word(TopicDAO.MARKETING, "Discount", "Giảm giá"));
        words.add(new Word(TopicDAO.MARKETING, "Exchange", "Thay đổi"));
        words.add(new Word(TopicDAO.MARKETING, "Initiator", "Người khởi đầu"));
        words.add(new Word(TopicDAO.MARKETING, "List price", "Giá niêm yết"));
    }

}
