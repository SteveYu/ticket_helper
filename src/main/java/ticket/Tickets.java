package ticket;

public class Tickets {
	private boolean flag;
	private String searchDate;
	private Ticket[] datas;

	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getSearchData() {
		return searchDate;
	}
	public void setSearchData(String searchData) {
		this.searchDate = searchData;
	}
	public Ticket[] getDatas() {
		return datas;
	}
	public void setDatas(Ticket[] ticketList) {
		this.datas = ticketList;
	}

	public boolean haveTicket() {
		boolean haveTicket = false;
		for(Ticket t : datas) {
			if(t.canBuy()) {
				haveTicket = true;
				break;
			}
		}
		
		return haveTicket;
	}
	
	public void outputAvailableTickets() {
		System.out.println("����\t����վ-����վ\t\t����ʱ��-����ʱ��\t\t������\tһ����\t������\t����\tӲ��\tӲ��\t����");
		for(Ticket t : datas) {
			if(t.canBuy()) {
				System.out.println(t.toString());
			}
		}
	}
}
