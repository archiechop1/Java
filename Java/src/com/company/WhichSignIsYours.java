package com.company;

import java.util.Scanner;

public class WhichSignIsYours {
    public static void main(String[] args) {
        sign();
    }

    public static String sign() {
        boolean isTrue = true;

        while (isTrue) {
            System.out.println("Please write a month of birth: ");
            Scanner scn = new Scanner(System.in);
            String month = scn.nextLine();
            Scanner scn2 = new Scanner(System.in);


                switch (month) {
                    case "January":
                        System.out.println("Your b-day month is January!");
                        System.out.println("Please write a day of birth.");
                        int day = scn2.nextInt();
                        while (isTrue) {
                            if (day < 1 || day > 31) {
                                System.out.println("Please write a day of birth again.");
                                day = scn2.nextInt();
                            } else {
                                if (day >= 1 && day <= 19) {
                                    System.out.println("Your sign is Capricorn!");
                                } else if (day >= 20 && day <= 31) {
                                    System.out.println("Your sign is Aquarius!");
                                } else {
                                    System.out.println("Wrong day, try again!");
                                }
                                isTrue = false;
                            }

                            }
                        break;

                    case "February":
                        System.out.println("Your b-day month is February!");
                        System.out.println("Please write a day of birth.");
                        int day2 = scn2.nextInt();
                        if (day2 >= 1 && day2 <= 19) {
                            System.out.println("Your sign is Aquarius!");
                        } else if (day2 >= 20 && day2 <= 29) {
                            System.out.println("Your sign is Pisces!");
                        } else {
                            System.out.println("Wrong day, try again!");
                        }
                        isTrue = false;
                        break;
                    case "March":
                        System.out.println("Your b-day month is March!");
                        System.out.println("Please write a day of birth.");
                        int day3 = scn2.nextInt();
                        if (day3 >= 1 && day3 <= 20) {
                            System.out.println("Your sign is Pisces!");
                        } else if (day3 >= 21 && day3 <= 31) {
                            System.out.println("Your sign is Aries!");
                        } else {
                            System.out.println("Wrong day, try again!");
                        }
                        isTrue = false;
                        break;
                    case "April":
                        System.out.println("Your b-day month is April!");
                        System.out.println("Please write a day of birth.");
                        int day4 = scn2.nextInt();
                        if (day4 >= 1 && day4 <= 20) {
                            System.out.println("Your sign is Aries!");
                        } else if (day4 >= 21 && day4 <= 30) {
                            System.out.println("Your sign is Taurus!");
                        } else {
                            System.out.println("Wrong day, try again!");
                        }
                        isTrue = false;
                        break;
                    case "May":
                        System.out.println("Your b-day month is May!");
                        System.out.println("Please write a day of birth.");
                        int day5 = scn2.nextInt();
                        if (day5 >= 1 && day5 <= 21) {
                            System.out.println("Your sign is Taurus!");
                        } else if (day5 >= 22 && day5 <= 31) {
                            System.out.println("Your sign is Gemini!");
                        } else {
                            System.out.println("Wrong day, try again!");
                        }
                        isTrue = false;
                        break;
                    case "June":
                        System.out.println("Your b-day month is June!");
                        System.out.println("Please write a day of birth.");
                        int day6 = scn2.nextInt();
                        if (day6 >= 1 && day6 <= 21) {
                            System.out.println("Your sign is Gemini!");
                        } else if (day6 >= 22 && day6 <= 30) {
                            System.out.println("Your sign is Cancer!");
                        } else {
                            System.out.println("Wrong day, try again!");
                        }
                        isTrue = false;
                        break;
                    case "July":
                        System.out.println("Your b-day month is July!");
                        System.out.println("Please write a day of birth.");
                        int day7 = scn2.nextInt();
                        if (day7 >= 1 && day7 <= 22) {
                            System.out.println("Your sign is Cancer!");
                        } else if (day7 >= 23 && day7 <= 31) {
                            System.out.println("Your sign is Leo!");
                        } else {
                            System.out.println("Wrong day, try again!");
                        }
                        isTrue = false;
                        break;
                    case "August":
                        System.out.println("Your b-day month is August!");
                        System.out.println("Please write a day of birth.");
                        int day8 = scn2.nextInt();
                        if (day8 >= 1 && day8 <= 21) {
                            System.out.println("Your sign is Leo!");
                        } else if (day8 >= 22 && day8 <= 31) {
                            System.out.println("Your sign is Virgo!");
                        } else {
                            System.out.println("Wrong day, try again!");
                        }
                        isTrue = false;
                        break;
                    case "September":
                        System.out.println("Your b-day month is September!");
                        System.out.println("Please write a day of birth.");
                        int day9 = scn2.nextInt();
                        if (day9 >= 1 && day9 <= 23) {
                            System.out.println("Your sign is Virgo!");
                        } else if (day9 >= 24 && day9 <= 30) {
                            System.out.println("Your sign is Libra!");
                        } else {
                            System.out.println("Wrong day, try again!");
                        }
                        isTrue = false;
                        break;
                    case "October":
                        System.out.println("Your b-day month is October!");
                        System.out.println("Please write a day of birth.");
                        int day10 = scn2.nextInt();
                        if (day10 >= 1 && day10 <= 23) {
                            System.out.println("Your sign is Libra!");
                        } else if (day10 >= 24 && day10 <= 31) {
                            System.out.println("Your sign is Scorpio!");
                        } else {
                            System.out.println("Wrong day, try again!");
                        }
                        isTrue = false;
                        break;
                    case "November":
                        System.out.println("Your b-day month is November!");
                        System.out.println("Please write a day of birth.");
                        int day11 = scn2.nextInt();
                        if (day11 >= 1 && day11 <= 22) {
                            System.out.println("Your sign is Scorpio!");
                        } else if (day11 >= 23 && day11 <= 30) {
                            System.out.println("Your sign is Sagittarius!");
                        } else {
                            System.out.println("Wrong day, try again!");
                        }
                        isTrue = false;
                        break;
                    case "December":
                        System.out.println("Your b-day month is December!");
                        System.out.println("Please write a day of birth.");
                        int day12 = scn2.nextInt();
                        if (day12 >= 1 && day12 <= 22) {
                            System.out.println("Your sign is Sagittarius!");
                        } else if (day12 >= 23 && day12 <= 31) {
                            System.out.println("Your sign is Capricorn!");
                        } else {
                            System.out.println("Wrong day, try again!");
                        }
                        isTrue = false;
                        break;
                    default:
                        System.out.println("This month doesn't exist, try again!");
                }
            }
        return null;
    }
}
