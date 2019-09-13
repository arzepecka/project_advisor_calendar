package pl.sda.advisor_calendar.model.calendar;

public class CalendarController {
//    @WebServlet(urlPatterns = "/todo/calendar")
//    public class CalendarServlet extends HttpServlet {
//
//        private TaskRepository repository = TaskRepository.INSTANCE;
//
//        @Override
//        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//            LocalDate now = LocalDate.now();
//            Integer month = Optional.ofNullable(
//                    req.getParameter("month"))
//                    .map(Integer::parseInt)
//                    .orElse(now.getMonthValue());
//            Integer year = Optional.ofNullable(
//                    req.getParameter("year"))
//                    .map(Integer::parseInt)
//                    .orElse(now.getYear());
//
//            LocalDate firstDay = LocalDate.of(year, month, 1);
//            LocalDate lastDay =
//                    firstDay.with(TemporalAdjusters.lastDayOfMonth());
//
//            List<Task> taskForMonth = repository
//                    .findForDates(firstDay, lastDay);
//
//            List<List<Task>> tasks = new ArrayList<>();
//            for (int i = 1; i <= lastDay.getDayOfMonth(); i++) {
//                LocalDate date = firstDay.withDayOfMonth(i);
//                tasks.add(
//                        taskForMonth.stream()
//                                .filter(task -> task.getDate().equals(date))
//                                .collect(Collectors.toList())
//                );
//            }
//
//            req.setAttribute("tasks", tasks);
//            req.setAttribute("firstDay", firstDay);
//            req.setAttribute("monthName", firstDay.getMonth()
//                    .getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault()));
//
//            req.getRequestDispatcher("/todo/calendar.jsp")
//                    .forward(req, resp);
//        }
//    }

}
