package food.foodproject;

import SQL.DAO;
import SQL.DTO;
import crawling.crawl;
import food.foodproject.domain.Food;
import food.foodproject.dto.FoodDto;
import food.foodproject.dto.FoodOptionDto;
import food.foodproject.repository.FoodRepository;
import food.foodproject.repository.FoodRepositoryImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class FoodOptionTest {
    @Autowired
    FoodRepository foodRepository;
    @Autowired
    FoodRepositoryImpl foodRepositorylmpl;

    Food food;
    String[] names, intros, tastes, theme, ingredients, situations, recipe, thumbnail, stepImg;
    @Test
    void contextLoads() {

        // 한식 35
        crawl.getCrawl("https://www.10000recipe.com/recipe/6751412"); //        소고기 미역국
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("해장_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/1176470"); //        닭볶음탕
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6834925"); //        소고기무국
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("해장_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6928359"); //        떡국
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("해장_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6953177"); //        김치 떡국
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_고소_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("해장_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6927150"); //        만두국
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("해장_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6929231"); //        김치찌개
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("해장_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/4850648"); //        된장찌개
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("해장_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6842456"); //        갈릭 닭가슴살버섯볶음
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6898497"); //        팽이버섯 베이컨 볶음
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6901907"); //        낙지볶음
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6836969"); //        쭈꾸미삼겹살치즈볶음
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6841752"); //        두루치기 제육볶음
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6629857"); //        소세지야채볶음
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6875668"); //        새우볶음밥
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6838790"); //        스팸 두부김치
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_고소_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6882107"); //        데리야키 닭고기 구이
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_달콤_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6863727"); //        닭갈비
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/4123616"); //        고추장 참치김치볶음 계란말이
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_고소_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("술안주_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6897873"); //        감자전
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6908862"); //        김치전
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_고소_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6885038"); //        스팸 계란말이
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("술안주_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6887599"); //        소고기부추수육
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6836877"); //        고구마맛탕
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6838254"); //        두부조림
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("술안주_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6837292"); //        베이컨말이 주먹밥
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6727692"); //        참치마요 주먹밥
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6847429"); //        삼겹살김밥
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6927171"); //        스팸꼬마김밥
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6974014"); //        김치콩나물라면
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_해장");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        // 한식 추가
        crawl.getCrawl("https://www.10000recipe.com/recipe/4030952"); //        고추된장박이
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6830616"); //        배추 된장 들깨무침
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6898328"); //        참치 비빔밥
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_고소_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6973706"); //        들깨가루 무청시래기나물
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6924357"); //        매콤 삼겹살 강정
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_짭짤");
        food.setTheme("한식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);


        // 분식 18
        crawl.getCrawl("https://www.10000recipe.com/recipe/6842954"); //        떡볶이
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_달콤_짭짤");
        food.setTheme("분식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6834570"); //        까르보나라 떡볶이
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소_짭짤");
        food.setTheme("분식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/745232"); //         기름 떡볶이
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소_짭짤");
        food.setTheme("분식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/2899675"); //        쫄면
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_달콤_짭짤");
        food.setTheme("분식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/5380902"); //        떡꼬치
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_달콤_짭짤");
        food.setTheme("분식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/1212077"); //        라볶이
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_달콤_짭짤");
        food.setTheme("분식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);


        // 분식 추가
        crawl.getCrawl("https://www.10000recipe.com/recipe/6898852"); //        잡채 계란 떡볶이
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_달콤_짭짤");
        food.setTheme("분식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6859183"); //        닭가슴살 치즈떡볶이
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_달콤_짭짤");
        food.setTheme("분식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6704677"); //        계란초
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_짭짤");
        food.setTheme("분식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("술안주_간식");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6862654"); //        메추리알 꼬치튀김
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_달콤_짭짤");
        food.setTheme("분식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("술안주_간식");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6844420"); //        빨간 어묵꼬치
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_달콤_짭짤");
        food.setTheme("분식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("술안주_간식");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6888110"); //        어묵 떡 볶음
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_짭짤");
        food.setTheme("분식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/5445436"); //        치즈밥
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_짭짤");
        food.setTheme("분식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6948256"); //        간장 떡볶이
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_짭짤");
        food.setTheme("분식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6893249"); //        김말이 튀김
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_짭짤");
        food.setTheme("분식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("술안주_간식");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6935081"); //        옛날 떡볶이
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_달콤_짭짤");
        food.setTheme("분식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6864678"); //        순대 꼬치
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_달콤_짭짤");
        food.setTheme("분식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("술안주_간식");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6944924"); //        피카츄 돈까스
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_달콤_짭짤");
        food.setTheme("분식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        // 양식 33
        crawl.getCrawl("https://www.10000recipe.com/recipe/6908129"); //        딸기 케이크
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/1698806"); //        초코 케이크
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/2328895"); //        치즈 케이크
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/2019368"); //        롤케이크
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6848554"); //        팬케이크
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/2451685"); //        컵케이크
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6912207"); //        프렌치토스트
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6944647"); //        마약토스트
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_짭짤");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6873002"); //        안심스테이크
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6926532"); //        등심스테이크
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6845657"); //        함박스테이크
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6972590"); //        알리오올리오 파스타
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6947036"); //        토마토 파스타
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_짭짤");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6845384"); //        크림 리조또
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6919947"); //        토마토 리조또
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_짭짤");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6884805"); //        감바스
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6866809"); //        오믈렛
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6846164"); //        고구마피자
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소_짭짤");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6840998"); //        불고기피자
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소_짭짤");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        // 양식 추가
        crawl.getCrawl("https://www.10000recipe.com/recipe/6848229"); //        웨지감자
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6980091"); //        피시차우더스프
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6916268"); //        서로인 스테이크
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6916949"); //        해산물 샐러드
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6916271"); //        시저 샐러드
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6915008"); //        미네스트로니스프
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_짭짤");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6914618"); //        바베큐 폭찹
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소_짭짤");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6914615"); //        프렌치프라이드 쉬림프
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_간식");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6913650"); //        비프 스튜
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6912062"); //        브라운 스톡
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_짭짤");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6912059"); //        사우전아일랜드 드레싱
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6910920"); //        훈제연어롤
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6910512"); //        피시뮈니엘
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6908131"); //        살리스버리 스테이크
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("양식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);


        // 중식 33
        crawl.getCrawl("https://www.10000recipe.com/recipe/6930703"); //        짜장면
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6837020"); //        나가사키짬뽕
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_고소_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_해장_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6840321"); //        소고기 해물짬뽕
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_고소_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_해장_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6952271"); //        멘보샤
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6888512"); //        고추 잡채
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("술안주_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6900916"); //        깐풍기
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6876530"); //        마파두부
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6958855"); //        버섯마라탕
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_고소_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_해장_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6841863"); //        탕수육
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        // 중식 추가
        crawl.getCrawl("https://www.10000recipe.com/recipe/6902300"); //        깐풍 만두
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6841290"); //        감자새우덮밥
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6906389"); //        오징어 청경채볶음
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/3526900"); //        닭가슴살 깐풍기
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6894222"); //        깐풍 가지
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6574194"); //        전가복
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6979966"); //        어향 가지
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_고소_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6971399"); //        양장피
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_고소");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6960670"); //        갑오징어탕
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_해장");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6923451"); //        유니짜장
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6922616"); //        경장육사
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_달콤_고소_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6921601"); //        부추 잡채
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6920233"); //        새우케찹볶음
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6920232"); //        빠스옥수수
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6919250"); //        빠스고구마
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6851401"); //        유산슬
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6529446"); //        꿔바로우
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6850085"); //        대파 볶음밥
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6863067"); //        칠리 새우
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("매콤_달콤_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6926404"); //        연두부 계란탕
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("술안주_해장");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6975367"); //        울면
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("중식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_술안주_해장");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        //일식 33
        crawl.getCrawl("https://www.10000recipe.com/recipe/6910028"); //        돈가스덮밥(가츠동)
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6846457"); //        볶음우동
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6835948"); //        유부초밥
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6847550"); //        밀푀유 나베
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6852018"); //        메밀 소바
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6841641"); //        오코노미야키
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6830755"); //        차슈와 돈코츠라멘
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("해장_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6873305"); //        두부튀김
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6841801"); //        어묵탕
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("술안주_해장");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6950738"); //        가라아게
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/28639"); //          규동
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/1907735"); //        구운 오니기리
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6910844"); //        차완무시
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);


        // 일식 추가
        crawl.getCrawl("https://www.10000recipe.com/recipe/6872865"); //        스키야키
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6867572"); //        새우 튀김
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6860728"); //        돈카츠 나베
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6976054"); //        부타동
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6972988"); //        테마끼스시
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6962840"); //        나스덴가쿠
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_술안주");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6949776"); //        계란 초밥
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6901369"); //        튀김 우동
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("술안주_해장");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6863466"); //        참치회 초밥
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6886034"); //        이모모찌
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6900875"); //        돼지고기 생강구이
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6864830"); //        고등어 데리야끼 구이
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6877721"); //        츠케모노
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6902083"); //        고마미소야끼
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("야식_식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6904235"); //        부타타마고동
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6871954"); //        히야시츄카
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6837789"); //        하이라이스
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6701312"); //        네코맘마
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6891671"); //        알감자 조림
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6838495"); //        낫또덮밥
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("고소_짭짤");
        food.setTheme("일식");
        food.setIngredient(crawl.ingredient);
        food.setSituation("식사");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        //디저트 20
        crawl.getCrawl("https://www.10000recipe.com/recipe/6833597"); //        마카롱
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6879930"); //        오레오 파르페
                food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/567648"); //         와플
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6842933"); //        파베 초콜릿
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6920543"); //        슈크림 붕어빵
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6898030"); //        딸기 타르트
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6944021"); //        에그 타르트
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/385575"); //         푸딩
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6909060"); //        수플레
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/1754794"); //        초코쿠키
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6896976"); //        버터쿠키
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        // 디저트 추가
        crawl.getCrawl("https://www.10000recipe.com/recipe/6865340"); //        컵 브라우니
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6848325"); //        아망디오쇼콜라
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/1135209"); //        호두 비스킷
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6847733"); //        아몬드샤브레
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6972163"); //        허니콤브
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6837881"); //        딸기잼 쿠키
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6972396"); //        블루베리잼 쿠키
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6928507"); //        말차샤브레 쿠키
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        crawl.getCrawl("https://www.10000recipe.com/recipe/6837208"); //        초콜릿 크랙쿠키
        food = new Food();
        food.setName(crawl.title);
        food.setIntro(crawl.intro);
        food.setTaste("달콤_고소");
        food.setTheme("디저트");
        food.setIngredient(crawl.ingredient);
        food.setSituation("간식_기타");
        food.setRecipe(crawl.step);
        food.setThumbnail(crawl.thumbnail);
        food.setStepImg(crawl.stepimg);
        foodRepository.save(food);

        DAO.updateFoodName("(색다른분식)잡채계란떡볶이", "잡채계란떡볶이");
        DAO.updateFoodName("[No.1 감자새우덮밥] 고급스러운 중식덮밥", "감자새우덮밥");
        DAO.updateFoodName("[간단 자취요리] 몽쉘로 쫀득쫀득 컵브라우니 만들기!", "컵브라우니");
        DAO.updateFoodName("[메추리알요리]메추리알 꼬치 튀김,추억의 분식요리", "메추리알 꼬치 튀김");
        DAO.updateFoodName("[분식] 옛날 분식집 떡볶이 만들기", "옛날 떡볶이");
        DAO.updateFoodName("[양식조리기능사 실기동영상] 미네스트로니스프 만드는방법", "미네스트로니 수프");
        DAO.updateFoodName("[양식조리기능사 실기동영상] 바베큐폭찹 만드는방법", "바베큐폭찹");
        DAO.updateFoodName("[양식조리기능사 실기동영상] 브라운스톡 만드는 법", "브라운스톡");
        DAO.updateFoodName("[양식조리기능사 실기동영상] 비프스튜 만드는 방법", "비프스튜");
        DAO.updateFoodName("[양식조리기능사 실기동영상] 사우전아일랜드드레싱 만드는 법", "사우전아일랜드 드레싱");
        DAO.updateFoodName("[양식조리기능사 실기동영상] 살리스버리 스테이크 만드는 법", "살리스버리 스테이크");
        DAO.updateFoodName("양식조리기능사 실기동영상] 서로인스테이크 만드는방법", "서로인 스테이크");
        DAO.updateFoodName("[양식조리기능사 실기동영상] 프렌치프라이드쉬림프 만드는방법", "프렌치 프라이드 쉬림프");
        DAO.updateFoodName("[양식조리기능사 실기동영상] 피시뮈니엘 만드는 법", "피시뮈니엘");
        DAO.updateFoodName("[양식조리기능사 실기동영상] 해산물샐러드 만드는방법", "해산물 샐러드");
        DAO.updateFoodName("[양식조리기능사 실기동영상]채소로 속을채운 훈제연어롤 만드는방법", "훈제연어롤");
        DAO.updateFoodName("[에어프라이어] 간단하고 맛있는 마약 토스트 만들기", "마약 토스트");
        DAO.updateFoodName("[일본가정식] 다이어트에도 효과적이라는 낫또 맛있게 먹는 법 :: 낫또덮밥", "낫또덮밥");
        DAO.updateFoodName("[중식/일품요리]밖에서 먹으면 너무 비싼 전가복, 집에서 간단히 만들어요~", "전가복");
        DAO.updateFoodName("[중식/일품요리]쫀득쫀득 입에 착 붙는 별미 요리! 찹살 탕수육, 꿔바로우", "꿔바로우");
        DAO.updateFoodName("[중식조리기능사] 경장육사 만드는 방법", "경장육사");
        DAO.updateFoodName("[중식조리기능사] 부추잡채 만드는 방법", "부추잡채");
        DAO.updateFoodName("[중식조리기능사] 빠스고구마 만드는 방법", "빠스고구마");
        DAO.updateFoodName("[중식조리기능사] 빠스옥수수 (옥수수빠스) 만드는 방법", "빠스옥수수");
        DAO.updateFoodName("[중식조리기능사] 새우케찹볶음 만드는 방법", "새우케찹볶음");
        DAO.updateFoodName("[중식조리기능사] 유니짜장 만드는 방법", "유니짜장");
        DAO.updateFoodName("# 분식요리, 간장 떡볶이", "간장 떡볶이");
        DAO.updateFoodName("10분 여름 가지반찬 가지된장구이/일식 나스덴가쿠", "나스덴가쿠");
        DAO.updateFoodName("10분간식 고구마피자", "고구마피자");
        DAO.updateFoodName("3단계로 만드는 날치알 테마끼스시(일식집에 나오는 그 삼각뿔...)", "테마끼스시");
        DAO.updateFoodName("간단 일식요리 계란초밥", "계란초밥");
        DAO.updateFoodName("감바스 알 아히요 만들기", "감바스 알 아히요");
        DAO.updateFoodName("고등어데리야끼구이 만드는 법(일본식 생선요리)", "고등어데리야끼 구이");
        DAO.updateFoodName("깐풍가지~가지요리 더 맛있게(중식)튀김옷을 입은 가지볶음", "깐풍가지볶음");
        DAO.updateFoodName("달지않아 선물하면 더좋은 계란쿠키맛 아몬드 블루베리 쨈쿠키~", "블루베리잼 쿠키");
        DAO.updateFoodName("달콤한 엄마표 딸기쨈쿠키 만들기 ♬", "딸기잼 쿠키");
        DAO.updateFoodName("닭가슴살 치즈떡볶이 매콤하게 든든한 분식", "닭가슴살 치즈떡볶이");
        DAO.updateFoodName("담백한 웨지감자 만들기...양식 사이드 메뉴( 아이간식 )", "웨지감자");
        DAO.updateFoodName("대파볶음밥 중식볶음밥 코코넛오일을 이용한 중국집볶음밥 만들기", "대파볶음밥");
        DAO.updateFoodName("돈가스덮밥 / 가츠동", "가츠동");
        DAO.updateFoodName("등심스테이크 l 기념일에 빠져서는 안되는 스테이크 레시피 ★", "등심스테이크");
        DAO.updateFoodName("매콤매콤 순대꼬치로 초간단 간식만들기~", "순대꼬치");
        DAO.updateFoodName("매콤하게 사랑받는 삼겹살 강정", "삼겹살 강정");
        DAO.updateFoodName("바삭한 미국식 달고나 허니콤브", "허니콤브");
        DAO.updateFoodName("밥으로 만드는 간단 토마토리조또 ★", "토마토리조또");
        DAO.updateFoodName("버터쿠키 만들기", "버터쿠키");
        DAO.updateFoodName("부드러운 소스가 매력적인 일본가정식 [하이라이스 / 하야시라이스]", "하이라이스");
        DAO.updateFoodName("부드럽고 달콤한 커스타드 푸딩 만들기", "커스타드 푸딩");
        DAO.updateFoodName("분식의 끝판왕 바삭한 김말이 튀김 만들기", "김말이 튀김");
        DAO.updateFoodName("분식의 유혹/빨간 어묵꼬치", "빨간 어묵꼬치");
        DAO.updateFoodName("아삭아삭한 고추된장박이", "고추된장박이");
        DAO.updateFoodName("알감자조림 (자연맛술을 이용한 일본가정식1편) 멸치볶음은 덤!", "알감자조림");
        DAO.updateFoodName("알리오올리오 파스타 만들기", "알리오올리오 파스타");
        DAO.updateFoodName("양식조리기능사 실기동영상] 시저샐러드 만드는방법", "시저 샐러드");
        DAO.updateFoodName("양장피 만들기 고급 중식 레스토랑 부럽지 않은 홈메이드 레시피", "양장피");
        DAO.updateFoodName("어향가지(중식가지볶음)", "어향가지");
        DAO.updateFoodName("에그타르트 만들기", "에그타르트");
        DAO.updateFoodName("유산슬 만들기 중식요리 중국요리 해산물 유산슬덮밥소스 만드는 방법", "유산슬");
        DAO.updateFoodName("일본 가정식, 돼지고기 생강구이", "돼지고기 생강구이");
        DAO.updateFoodName("일본가정식, 고마미소야끼", "고마미소야끼");
        DAO.updateFoodName("부타타마고동", "부타타마고동");
        DAO.updateFoodName("일본식 배추절임 츠케모노(쓰케모노)레시피", "츠케모노");
        DAO.updateFoodName("일본식 쇠고기 전골 ; 스키야키", "스키야키");
        DAO.updateFoodName("일본식 푸딩달걀찜, 차완무시", "차완무시");
        DAO.updateFoodName("일식 돼지고기덮밥 부타동", "부타동");
        DAO.updateFoodName("일식새우튀김 만드는 법", "새우튀김");
        DAO.updateFoodName("주꾸미삼겹살치즈볶음", "쭈꾸미삼겹살치즈볶음");
        DAO.updateFoodName("중식 울면(중식우동)", "울면");
        DAO.updateFoodName("중식우동(갑오징어탕)", "갑오징어탕");
        DAO.updateFoodName("중식의 대가 이연복 쉐프 깐풍만두 초간단 레시피", "깐풍만두");
        DAO.updateFoodName("중식풍 연두부 계란 수프(연두부계란탕)", "연두부 계란탕");
        DAO.updateFoodName("집들이 메뉴로 좋은 중식요리~ 닭가슴살 깐풍기", "닭가슴살 깐풍기");
        DAO.updateFoodName("집에서 즐기는 레스토랑급 안심스테이크 레시피!", "안심스테이크");
        DAO.updateFoodName("집에서도 일식집처럼 맛나게 ! 튀김우동", "튀김우동");
        DAO.updateFoodName("차슈와 돈코츠라멘", "돈코츠라멘");
        DAO.updateFoodName("참치회초밥 (일식조리기능사 실기종목)", "참치회초밥");
        DAO.updateFoodName("초간단 3분요리 일본 가정식 네코맘마", "네코맘마");
        DAO.updateFoodName("추억의 분식 계란초 만들기", "계란초");
        DAO.updateFoodName("추억의 학교앞 간식! 피카츄꼬치 만들기! 떡꼬치 소스는 꼭 듬뿍", "피카츄 돈까스");
        DAO.updateFoodName("프렌치토스트 만들기", "프렌치 토스트");
        DAO.updateFoodName("피시차우더수프 만드는 법 (양식요리)", "피시차우더 수프");
//        ArrayList<DTO> dtos = DAO.getFoods();
//        names = new String[dtos.size()];
//        intros = new String[dtos.size()];
//        tastes = new String[dtos.size()];
//        theme = new String[dtos.size()];
//        ingredients = new String[dtos.size()];
//        situations = new String[dtos.size()];
//        recipe = new String[dtos.size()];
//        thumbnail = new String[dtos.size()];
//        stepImg = new String[dtos.size()];
//        for(int i=0;i<dtos.size();i++) {
//            DTO dto = dtos.get(i);
//            names[i] = dto.getTitle();
//            intros[i] = dto.getIntro();
//            tastes[i] = dto.getTaste();
//            theme[i] = dto.getThema();
//            ingredients[i] = dto.getIngredient();
//            situations[i] = dto.getSituation();
//            recipe[i] = dto.getStep();
//            thumbnail[i] = dto.getThumbnail();
//            stepImg[i] = dto.getStepimg();
//        }
//        List<Long> foodIdxs = new ArrayList<>();
//        for(int i=0; i<dtos.size(); i++) {
//            Food food = new Food();
//            food.setName(names[i]);
//            food.setIntro(intros[i]);
//            food.setTaste(tastes[i]);
//            food.setTheme(theme[i]);
//            food.setIngredient(ingredients[i]);
//            food.setSituation(situations[i]);
//            food.setRecipe(recipe[i]);
//            food.setThumbnail(thumbnail[i]);
//            food.setStepImg(stepImg[i]);
//            foodRepository.save(food);
//        }
    }

}